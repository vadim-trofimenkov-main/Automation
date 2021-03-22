package main.trofimenkov.javapart.lambda;
//Задача 58. Лямбда-функции
//Реализовать функцоинальность калькулятора с помощью лямбда-фукнций.
public class Task58 {
    public static void main(String[] args) {
        Operational sum = (x, y) -> x + y;
        Operational extract = (x, y) -> x - y;
        Operational multiply = (x, y) -> x * y;
        Operational divide = (x, y) -> x / y;
        System.out.println(sum.calculate(10, 5));
        System.out.println(extract.calculate(10, 5));
        System.out.println(multiply.calculate(10, 5));
        System.out.println(divide.calculate(10, 5));
    }
    interface Operational {
        int calculate(int x, int y);
    }
}
