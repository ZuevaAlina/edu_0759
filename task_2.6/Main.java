/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b.
 Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        double del = a/b;
        if (a%b==0){
            System.out.println("Делится: "+del);
        }else{
            System.out.println("Делится с остатком "+a%b);
        }

    }
}
