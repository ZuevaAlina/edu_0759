/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя
рекурсию и не используя цикл.
*/


public class Main {
    static void printArray(int i, int[] array) {
        if (i >= array.length){
          return;
        }else{
            System.out.println(array[i]);
            printArray(i+1,array);
        }
    }

    public static void main(String[] args) {
        int[] num = {4, 2, 6, 2, 65};
        printArray(0,num);
    }

}