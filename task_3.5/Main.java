/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Main {
    public static void main(String[] args) {
        int num[] = {4, 2, 6, 2, 65};
    }

    public static int showElems() {
        int num[];
        while (num.length != 0) {
            System.out.println(showElems());
            num.length = num.length-1;
        }
    }
}