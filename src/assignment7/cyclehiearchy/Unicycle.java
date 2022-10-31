package assignment7.cyclehiearchy;

public class Unicycle extends Cycle {

    @Override
    public void cost() {
        System.out.println("Unicycle cost is 3000");
    }

    @Override
    public void cycleType() {
        System.out.println("Unicycle is non-gear");
    }

    public void balance() {
        System.out.println("Unicycle is balanced");
    }
}
