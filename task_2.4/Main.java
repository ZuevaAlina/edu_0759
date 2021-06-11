/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

//проверка связи

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите сумму вклада: ");
        int sum = scanner.nextInt();
        System.out.printf("Введите процент: ");
        int proc = scanner.nextInt();
        double deposit = (double)sum;
        String str ="";
        for (int i = 1; i < 6; i++) {
            deposit = deposit + (deposit / 100 * proc);
            str = i+" год: "+deposit;
            System.out.println(str);
        }


    }
}
