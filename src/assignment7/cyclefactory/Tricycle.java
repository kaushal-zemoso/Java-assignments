package assignment7.cyclefactory;

public class Tricycle implements Cycle {


    @Override
    public void cost(int cost) {
        System.out.println("Tricycle cost: "+cost);
    }

    @Override
    public void cycleType(String cycleTyp) {
        System.out.println("Tricycle type: "+cycleTyp);
    }
}
