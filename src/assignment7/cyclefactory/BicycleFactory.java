package assignment7.cyclefactory;

public class BicycleFactory {

    public void buildCycle() {

        Bicycle bicycle = new Bicycle();
        bicycle.cost(3000);
        bicycle.cycleType("Gear");
    }
}
