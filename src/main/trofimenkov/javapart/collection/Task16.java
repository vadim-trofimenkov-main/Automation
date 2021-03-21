package main.trofimenkov.javapart.collection;

import java.util.ArrayList;

//Задача 16. На коллекции класса ArrayList
//Элементы коллекции, которые меньше среднего арифметического, умножить на два.
//Для этого нужно, используя один класс:
//а. создать коллекцию и заполнить ее двадцатью случайными числами от ноля до 1,
// используя метод Math.random() (по умолчанию, он именно так и делает);
//б. вывести исходную коллекцию на консоль с комментарием, выделив функционал в метод;
//в. вычислить среднее арифметическое коллекции, выделив функционал в метод;
//г. умножить на 2 все элементы коллекции, которые меньше среднего арифметического, выделив функционал в метод;
//д. вывести полученную коллекцию на консоль с комментарием;
//е. отсортировать коллекцию по возрастанию, не используя метод .sort(), выделив функционал в метод;
//ж. вывести полученную коллекцию на консоль с комментарием;
//з. найти среднее арифметическое коллекции;
//и. удалить из коллекции все элементы, меньшие среднего арифметического, выделив функционал в метод;
//к. вывести полученную коллекцию на консоль с комментарием;
//л. найти среднее арифметическое коллекции;
//м. после всех элементов, меньших среднего арифметического, добавить элемент со значением 1000, выделив функционал в метод;
//н. вывести полученную коллекцию на консоль с комментарием;
//о. определить длину коллекции;
//п. создать новую коллекцию;
//р. поместить в новую коллекцию три средних элемента исходной коллекции, если ее размер нечетен,
// и два средних элемента коллекции, если четен, выделив функционал в метод;
//с. вывести на консоль новую коллекцию;
//т. оставить в исходной коллекции все элементы, кроме элементов новой коллекции, не создавая собственных методов;
//у. вывести на консоль конечный состав исходной коллекции.
public class Task16 {


    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        int size;
        random(arrayList);
        size = arrayList.size();
        printArrayList(arrayList);
        System.out.println("Size: " + size);

        double average = average(arrayList);
        System.out.println("Average value: " + average);
        multiplyTwo(arrayList);
        System.out.println("............Multiplying 2 all values less than average...........");
        printArrayList(arrayList);      // д
        sortArray(arrayList);           //e
        System.out.println("............Sorting Collection...........");
        printArrayList(arrayList);
        System.out.println("............Finding average...........");
        average = average(arrayList);            //з
        System.out.println("Average value: " + average);
        System.out.println("............Deleting all values less than average...........");
        deleteAllLessAverage(arrayList);   //и
        printArrayList(arrayList);
        System.out.println("............Finding average...........");
        average = average(arrayList);            //л
        System.out.println("Average value: " + average);
        addElement(arrayList);      //м
        System.out.println("............Adding 1000 value after element less than average...........");
        printArrayList(arrayList);
        size = arrayList.size();
        System.out.println("Size: " + size);   //о
        System.out.println("............Creating new Collection with average elements from Initial Collection...........");
        ArrayList<Double> newArrayList = new ArrayList<>();
        addAverageValues(newArrayList, arrayList);     //р
        System.out.println("Initial Collection: " + arrayList);
        System.out.println("New Collection: " + newArrayList);
        System.out.println("............Deleting elements of Initial Collection if they equal to elements of New Collection...........");
        for (int i = 0; i < newArrayList.size(); i++) {
            Double element = newArrayList.get(i);
            while (arrayList.contains(element)){
                arrayList.remove(element);
            }
        }
        System.out.println("Initial Collection: " + arrayList);
        System.out.println("New Collection: " + newArrayList);
    }

    public static void random(ArrayList<Double> arrayList) {
        double l;
        //   int r;
        for (int i = 0; i < 20; i++) {
            l = Math.random();           // рандом возвращает дабл
            //   r = (int) Math.round(l);    раунд возвращает лонг, силой преобразуем к инту, зная, что числа будут 0 или 2
            double roundOff = (double) Math.round(l * 100) / 100;     // округляет до 2 символов после запятой
            arrayList.add(roundOff);
        }
    }

    public static void printArrayList(ArrayList<Double> arrayList) {
        System.out.println("ArrayList: " + arrayList);
    }

    public static double average(ArrayList<Double> arrayList) {
        int size = arrayList.size();
        double sum = sum(arrayList);
        double average = sum / size;
        return (double) Math.round(average * 100) / 100;
    }

    public static double sum(ArrayList<Double> arrayList) {
        int size = arrayList.size();
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arrayList.get(i);
        }
        return sum;
    }

    public static void multiplyTwo(ArrayList<Double> arrayList) {
        double avr = average(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            double element = arrayList.get(i);
            if (element < avr) {
                element *= 2;
                arrayList.set(i, element);
            }
        }
    }

    public static void sortArray(ArrayList<Double> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                double previous = arrayList.get(j);
                double next = arrayList.get(j + 1);
                if (previous > next) {
                    double temp = previous;
                    arrayList.set(j, next);
                    arrayList.set(j + 1, temp);
                }
            }
        }
    }

    public static void deleteAllLessAverage(ArrayList<Double> arrayList) {
        double avr = average(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            double element = arrayList.get(i);
            if (element < avr) {
                arrayList.remove(element);
                i--;
            }
        }
    }

    public static void addElement(ArrayList<Double> arrayList) {
        double avr = average(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            double element = arrayList.get(i);
            if (element < avr) {
                arrayList.add(i + 1, 1000.00);
                i++;
            }
        }
    }

    public static void addAverageValues(ArrayList<Double> newArrayList, ArrayList<Double> arrayList) {
        int averageIndex = arrayList.size() / 2;
        newArrayList.add(arrayList.get(averageIndex - 1));
        newArrayList.add(arrayList.get(averageIndex));
        if (arrayList.size() % 2 != 0) {
            newArrayList.add(arrayList.get(averageIndex + 1));
        }
    }
}
