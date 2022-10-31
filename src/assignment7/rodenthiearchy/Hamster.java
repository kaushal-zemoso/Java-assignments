package assignment7.rodenthiearchy;

public class Hamster extends Rodent{

    public Hamster() {
        System.out.println("Hamsters are rodents belonging to the subfamily Cricetinae");
    }

    @Override
    public void eat() {
        System.out.println("A Hamster can eat");
    }

    @Override
    public void sleep() {
        System.out.println("A Hamster can sleep");
    }

    @Override
    public void jump() {
        System.out.println("A Hamster can jump");
    }
}
