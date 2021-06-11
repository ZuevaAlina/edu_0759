import java.util.Scanner;

/*
 *  ***Гостиница***
 *  1) Гостиница
 *  2) Номера (кол-во мест(1-3), сан.узел(есть/нет), питаение(есть/нет), wifi(есть/нет), свободен/занят)
 *
 *   *Задание для лабораторной работы №4*
 *   + Освободить комнату
 *   + Вывести свойства комнаты
 *   + Показать комнаты с WiFi
 *   + Показать комнаты с WC
 *   + Показать комнаты с Eat
 *   + Показать комнаты по кол-ву спальных мест
 *   Отобразить список команд
 * */
public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room((byte) 1,false,false,true,(byte) 11),
                new Room((byte) 2,true,true,false,(byte) 12),
                new Room((byte) 1,false,true,true,(byte) 13),
                new Room((byte) 3,true,false,false,(byte) 21),
                new Room((byte) 2,false,false,false,(byte) 22),
                new Room((byte) 1,true,true,true,(byte) 23),
                new Room((byte) 3,false,true,false,(byte) 31),
                new Room((byte) 3,true,true,false,(byte) 32),
                new Room((byte) 1,false,false,true,(byte) 33),
        };
        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true){
            System.out.println("Введите команду: \n" +
                    "getFreeRooms: \t Список своюодных комнат \n" +
                    "vacateRoom: \t Освободить комнату \n" +
                    "propertiesRoom: \t Характеристики комнаты \n" +
                    "getWiFiRooms: \t Список комнат с WiFi \n" +
                    "getWCRooms: \t Список комнат с WC \n" +
                    "getEatRooms: \t Список комнат с Eat \n" +
                    "getQRooms: \t Количество спальных мест");
            command = scanner.nextLine();
            if(command.equals("getFreeRooms")){
                hotel.getFreeRooms();
            }else if(command.equals("reserveRoom")){
                System.out.print("Введите номер комнаты для бронирования: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.reserveRoom(roomNumber);
//начало моего кода
            }else if(command.equals("vacateRoom")){
                System.out.print("Введите номер комнаты, которая освободится: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.vacateRoom(roomNumber);
            }else if(command.equals("propertiesRoom")){
                System.out.print("Введите номер комнаты, для вывода свойств: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.propertiesRoom(roomNumber);
            }else if(command.equals("getWiFiRooms")){
                System.out.println("Комнаты с WiFi: \n");
                hotel.getWiFiRooms();
            }else if(command.equals("getWCRooms")){
                System.out.println("Комнаты с WC: \n");
                hotel.getWCRooms();
            }else if(command.equals("getEatRooms")){
                System.out.println("Комнаты с Eat: \n");
                hotel.getEatRooms();
            }else if(command.equals("getQRooms")){
                System.out.println("Количество мест в комнатах: \n");
                hotel.getQRooms();
//окончание моего кода
            }else if (command.equals("exit")){
                break;
            }
        }

    }
}
