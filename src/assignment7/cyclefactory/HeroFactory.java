package assignment7.cyclefactory;

public class HeroFactory {

    public static void main(String[] args) {

        UnicycleFactory unicycleFactory = new UnicycleFactory();
        unicycleFactory.buildCycle();

        BicycleFactory bicycleFactory = new BicycleFactory();
        bicycleFactory.buildCycle();

        TricycleFactory tricycleFactory = new TricycleFactory();
        tricycleFactory.buildCycle();
    }
}
