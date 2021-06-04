/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a/100.0f*115);
    }
}
