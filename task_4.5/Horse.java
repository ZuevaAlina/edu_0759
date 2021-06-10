public class Horse extends Animal{
    public Horse(boolean vegetarian, String color, int paws) {
        super(vegetarian, color, paws);
    }
    void run(){
        System.out.println("Игого, я поскакал(а)");
    }
}
