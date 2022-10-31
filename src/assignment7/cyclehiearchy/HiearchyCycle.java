package assignment7.cyclehiearchy;

public class HiearchyCycle {

    public static void main(String[] args) {

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle[] cycles = new Cycle[3];   // Upcasting - Cast to supertype.

        cycles[0] = (Cycle)unicycle;
        cycles[1] = (Cycle)bicycle;
        cycles[2] = (Cycle)tricycle;

        for (int i = 0; i < cycles.length; i++) {
            cycles[i].cost();
            cycles[i].cycleType();
            /* cycles[i].balance();  // It returns an error, because Cycle class doesn't have balance method. */
        }

        Cycle cycle1 = new Unicycle();
        Cycle cycle2 = new Bicycle();
        Cycle cycle3 = new Tricycle();

        Unicycle unicycle1 = (Unicycle) cycle1;  // Downcasting - Cast to subtype
        Bicycle bicycle1 = (Bicycle) cycle2;
        Tricycle tricycle1 = (Tricycle) cycle3;

        unicycle1.cost();
        unicycle1.cycleType();
        unicycle1.balance();

        bicycle1.cost();
        bicycle1.cycleType();
        bicycle1.balance();

        tricycle1.cost();
        tricycle1.cycleType();
        /* tricycle1.balance();  // It returns an error, because Tricycle class doesn't have balance method. */

    }
}
