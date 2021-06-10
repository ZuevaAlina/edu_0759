public class Animal{
    boolean vegetarian;
    String color;
    int paws;

    public Animal(boolean vegetarian, String speak, int paws) {
        this.vegetarian = vegetarian;
        this.color = color;
        this.paws = paws;
    }

    boolean getVegetarian() { return vegetarian;}
    String getColor() { return color; }
    int getPaws() { return paws; }
}