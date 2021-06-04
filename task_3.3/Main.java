/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/


import java.util.Scanner;

public class Main {
    public static int fun1(int a, int b) {
        if (a==b) return 1;
        else return 0;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (fun1(a,b) == 1) System.out.println("true");
        else System.out.println("false");
            }


}
