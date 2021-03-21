package main.trofimenkov.javapart.string;

//Напишите метод для поиска самой длинной строки в массиве.
public class Task46 {
    public static void main(String[] args) {
        String[] days = new String[]
                {
                        "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"
                };
        String day = longestDay(days);
        System.out.println("День недели: " + day);

    }

    private static String longestDay(String[] days) {
        String day;
        int l = days.length;
        int length = l;
        int index = 0;
        for (int j = 0; j < l; j++) {
            int i = days[j].length();
            if (i < length) {
                length = i;
                index = j;
            }
        }
        System.out.println("Индекс: " + index);
        System.out.println("Длина: " + length);
        day = days[index];
        return day;
    }
}
