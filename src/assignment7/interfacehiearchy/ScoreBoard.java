package assignment7.interfacehiearchy;

public class ScoreBoard implements AllRounder {


    @Override
    public void strikeRate() {
        System.out.println("Strike Rate: 135.5");
    }

    @Override
    public void numberOfRuns() {
        System.out.println("Runs scored: 3000");
    }

    @Override
    public void numberOfBoundaries() {
        System.out.println("Boundaries: 30");
    }

    @Override
    public void numberOfWickets() {
        System.out.println("Wickets: 35");
    }

    @Override
    public void economyRate() {
        System.out.println("Economy Rate: 6.5");
    }

    @Override
    public void numberOfCatches() {
        System.out.println("Catches: 15");
    }

    @Override
    public void numberOfRunOuts() {
        System.out.println("Run outs: 10");
    }
}
