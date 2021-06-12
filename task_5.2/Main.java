/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.*;

/* 
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> house = new HashMap<String,String>();
        while (true) {
            System.out.println("Введите город через Enter или Enter закончить ввод");
            String town = scanner.nextLine();
            System.out.println("Введите фамилию через Enter или Enter закончить ввод");
            String family = scanner.nextLine();
            if (town.isEmpty()) {
                break;
            }
            house.put(town,family);
        }
        System.out.println("Создана коллекция: \n" +house+"\n");
        System.out.println("Введите город");
        String enterTown = scanner.next();
        System.out.println("В городе "+ enterTown+ " живут "+house.get(enterTown));
    }
}