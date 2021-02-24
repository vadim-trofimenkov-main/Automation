package main.collection;

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
    private static ArrayList<Double> arrayList = new ArrayList<>();
    private static int size;

    public static void main(String[] args) {

        random(arrayList);
        size = arrayList.size();
        printArrayList(arrayList);

        double average = average(arrayList);
        System.out.println("Average value: " + average);
        multiplyTwo(arrayList);
        printArrayList(arrayList);      // д


    }

    public static void random(ArrayList<Double> arrayList) {
        double l;
        int r;
        for (int i = 0; i < 20; i++) {
            l = Math.random();           // рандом возвращает дабл
            //   r = (int) Math.round(l);    раунд возвращает лонг, силой преобразуем к инту, зная, что числа будут 0 или 2
            arrayList.add(l);
        }

    }

    public static void printArrayList(ArrayList<Double> arrayList) {
        System.out.println("ArrayList: " + arrayList);
    }

    public static double average(ArrayList<Double> arrayList) {
        double sum = sum(arrayList);
        return sum / size;
    }

    public static double sum(ArrayList<Double> arrayList) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arrayList.get(i);
        }
        return sum;
    }

    public static void multiplyTwo(ArrayList<Double> arrayList) {
        double avr = average(arrayList);
        for (int i = 0; i < size; i++) {
            double element = arrayList.get(i);
            if (element < avr) {
                element *= 2;
                arrayList.set(i, element);
            }
        }
    }


}
