package assignment7.rodenthiearchy;

public class Mouse extends Rodent{

    public Mouse() {
        System.out.println("A Mouse is a small rodent.");
    }

    @Override
    public void eat() {
        System.out.println("A Mouse can eat");
    }

    @Override
    public void sleep() {
        System.out.println("A Mouse can sleep");
    }

    @Override
    public void jump() {
        System.out.println("A Mouse can jump");
    }
}
