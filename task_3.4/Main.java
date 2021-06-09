/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
 Если их сумма больше 10 - пусть функция вернет true, а если нет - false.

*/

//проверка связи

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (fun1(a,b) == 1) System.out.println("true");
        else System.out.println("false");
    }


    public static int fun1(int a, int b) {
      if ((a+b)>10) return 1;
      else return 0;
    }
}
