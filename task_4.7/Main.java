/*
Реализуй в классе Fox интерфейс Animal.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что создавать дополнительные классы и удалять методы нельзя!

Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В интерфейсе Animal нужно объявить метод getColor.
•	Дополнительные классы или интерфейсы создавать нельзя.
*/

public class Main {
    public static void main(String[] args){
    Animal ast1 = new Fox("red", "ted");
        System.out.println(ast1.getColor());
    }
}

interface Animal {
    String getColor();
    }

    
class Fox implements Animal{
    String color;
    String name;

    public Fox(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return "Fox";
    }
    public String getColor() {
        return "Red";
    }

}
