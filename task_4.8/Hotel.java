public class Hotel {
    Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    //вывод на экран списка свободных комнат
    public void getFreeRooms(){
        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree()) freeRoomsList += rooms[i].getRoomNumber()+", ";
        }
        System.out.println("Номера свободных комнат "+freeRoomsList);
    }
    //-------начало моего кода
    //освобождение комнаты
    public void vacateRoom(byte roomNumber){
        String info = "Эта комната свободна";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if(room.getRoomNumber() == roomNumber && !room.isFree()){
                room.setFree(true);
                info = ("Комната номер "+roomNumber+" теперь свободна");
                break;
            }else if(room.getRoomNumber() == roomNumber && room.isFree()){
                info = "Комната "+roomNumber+" и так свободна";
                break;
            }
        }
        System.out.println(info);
    }
    //вывести свойства комнаты
    public void propertiesRoom(byte roomNumber){
        String propertiesList = "";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber) {
                propertiesList += "\n Номер комнаты: \t"+rooms[i].getRoomNumber()+" ; \n "+
                        "Количество мест: \t"+rooms[i].getQuantity()+" ; \n "+
                        "Санузел: \t"+rooms[i].isWc()+" ; \n "+
                        "Питание: \t"+rooms[i].isEat()+" ; \n "+
                        "WiFi: \t"+rooms[i].isWifi()+" ; \n "+
                        "Свободен: \t"+rooms[i].isFree()+" ;";
            }else{
                System.out.println("Такой комнаты нет");
                break;
            }

        }
        System.out.println(propertiesList);
    }

    //-------окончание моего кода

        //бронирование комнаты
    public void reserveRoom(byte roomNumber){
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if(room.getRoomNumber() == roomNumber && room.isFree()){
                room.setFree(false);
                info = ("Комната номер "+roomNumber+" успешно забронированна");
                break;
            }else if(room.getRoomNumber() == roomNumber && !room.isFree()){
                info = "Комната "+roomNumber+" занята";
                break;
            }
        }
        System.out.println(info);
    }
}