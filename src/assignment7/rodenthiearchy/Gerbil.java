package assignment7.rodenthiearchy;

public class Gerbil extends Rodent{

    public Gerbil() {
        System.out.println("The Mongolian gerbil or Mongolian jird is a small rodent belonging to the subfamily Gerbillinae.");
    }

    @Override
    public void eat() {
        System.out.println("A Gerbil can eat");
    }

    @Override
    public void sleep() {
        System.out.println("A Gerbil can sleep");
    }

    @Override
    public void jump() {
        System.out.println("A Gerbil can jump");
    }
}
