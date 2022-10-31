package assignment7.cyclehiearchy;

public class Bicycle extends Cycle {

    @Override
    public void cost() {
        System.out.println("Bicycle cost is 4000");
    }

    @Override
    public void cycleType() {
        System.out.println("Bicycle is gear cycle");
    }

    public void balance() {
        System.out.println("Bicycle is balanced");
    }
}
