package assignment7.cyclefactory;

public class Bicycle implements Cycle {


    @Override
    public void cost(int cost) {
        System.out.println("Bicycle cost: "+cost);
    }

    @Override
    public void cycleType(String cycleTyp) {
        System.out.println("Bicycle Type: "+cycleTyp);
    }
}
