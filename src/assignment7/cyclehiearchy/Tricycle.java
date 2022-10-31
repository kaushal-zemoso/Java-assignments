package assignment7.cyclehiearchy;

public class Tricycle extends Cycle {

    @Override
    public void cost() {
        System.out.println("Tricycle cost 5000");
    }

    @Override
    public void cycleType() {
        System.out.println("Tricycle is non-gear");
    }
}
