/* 
ВНИМАНИЕ! ДЛЯ РЕШЕНИЯ ЗАДАЧИ НЕОБХОДИМО ПРОСМОТРЕТЬ УРОК №4 https://www.youtube.com/watch?v=WmZ6kVTlWtg&list=PLOep0pi-UBExIxCNegkvCrBuDh0TE7Ihq&index=4
Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

//проверка связи

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Введите температуру в градусах цельсия:");
       int a = scan.nextInt();
       double res = 9.0f/5*a+32;
        String formattedDouble = new DecimalFormat("#0.00").format(res);
       // String formattedDouble = new DecimalFormat("#0.00").format(0.1321231);
        System.out.print(formattedDouble);
        //System.out.print("%.3f% n",4.020202);
       //System.out.print("% - 10.3f% n",res);
    }
}
