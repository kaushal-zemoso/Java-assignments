package assignment7.cyclefactory;

public class UnicycleFactory {

    public void buildCycle() {
        Unicycle unicycle = new Unicycle();
        unicycle.cost(2000);
        unicycle.cycleType("Non-gear");
    }
}
