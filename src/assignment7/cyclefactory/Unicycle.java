package assignment7.cyclefactory;

public class Unicycle implements Cycle {


    @Override
    public void cost(int cost) {
        System.out.println("Unicycle cost: "+cost);
    }

    @Override
    public void cycleType(String cycleTyp) {
        System.out.println("Unicycle Type: "+cycleTyp);
    }
}
