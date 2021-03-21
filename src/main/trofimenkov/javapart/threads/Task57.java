package main.trofimenkov.javapart.threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

//Задача 57. Создать потоки:
//1. Унаследовать новый класс от класса Thread;
//2. Реализовать в классе интерфейс Runnable.
//Синхронизировать потоки с помощью:
//1. метода synchronize;
//2. класса ReentrantLock.
//Реализовать Семафор на одном из примеров.
public class Task57 {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        CommonResource res = new CommonResource();
        ReentrantLock lock = new ReentrantLock();
        Semaphore semaphore = new Semaphore(1);
        for (int i = 0; i < 6; i++) {
            Thread thread = new Thread(new MyTreadIntf(res, lock));  // ------  Реализовать в классе интерфейс Runnable + Синхронизировать потоки с помощью класса ReentrantLock.
//            Thread thread = new MyTread(res);                          //------  Унаследовать новый класс от класса Thread + Синхронизировать потоки с помощью метода synchronize;
            thread.setName("Поток " + i);
            thread.start();
        }
        //-----------Semaphore execute code start --------------//
//        new Thread(new SemaphoreExample(res, semaphore, "My Thread 1")).start();
//        new Thread(new SemaphoreExample(res, semaphore, "My Thread 2")).start();
//        new Thread(new SemaphoreExample(res, semaphore, "My Thread 3")).start();
        //-----------Semaphore execute code end --------------//
        System.out.println("Главный поток завершил работу...");
    }

    public static class CommonResource {
        int x = 0;
    }

    public static class MyTread extends Thread {
        CommonResource res;

        public MyTread(CommonResource res) {
            this.res = res;
        }

        @Override
        public void run() {
            synchronized (res) {
                res.x = 1;
                for (int i = 1; i < 5; i++) {
                    System.out.printf("%s, Ресурс: %d \n", Thread.currentThread().getName(), res.x);
                    res.x++;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class MyTreadIntf implements Runnable {
        CommonResource res;
        ReentrantLock locker;

        public MyTreadIntf(CommonResource res, ReentrantLock locker) {
            this.res = res;
            this.locker = locker;
        }

        @Override
        public void run() {
            try {
                locker.lock();
                res.x = 1;
                for (int i = 1; i < 5; i++) {
                    System.out.printf("%s, Ресурс: %d \n", Thread.currentThread().getName(), res.x);
                    res.x++;
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("Поток прерван: " + e.getMessage());
            } finally {
                locker.unlock();
            }
        }
    }
    public static class SemaphoreExample implements Runnable {
        CommonResource res;
        Semaphore semaphore;
        String name;

        public SemaphoreExample(CommonResource res, Semaphore semaphore, String name) {
            this.res = res;
            this.semaphore = semaphore;
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(name + " ожидает разрешение");
                semaphore.acquire();
                res.x = 1;
                for (int i = 1; i < 5; i++) {
                    System.out.println(this.name + " : " + res.x);
                    res.x++;
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("Поток прерван: " + e.getMessage());
            }
            System.out.println(name + " освобождает разрешение");
            semaphore.release();
        }
    }
}
