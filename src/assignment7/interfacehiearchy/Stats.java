package assignment7.interfacehiearchy;

public class Stats extends ScoreBoard implements AllRounder {

    public void batsmenStats(Batsmen batsmen) {
        System.out.println("Batsmen Stats");
        batsmen.numberOfRuns();
        batsmen.numberOfBoundaries();
    }

    public void bowlerStats(Bowler bowler) {
        System.out.println("Bowler Stats");
        bowler.numberOfWickets();
        bowler.economyRate();
    }

    public void fielderStats(Fielder fielder) {
        System.out.println("Fielder Stats");
        fielder.numberOfCatches();
        fielder.numberOfRunOuts();
    }

    public void PlayerProfile(AllRounder allRounder) {
        System.out.println("Player Profile");
        allRounder.numberOfRuns();
        allRounder.numberOfBoundaries();
        allRounder.strikeRate();
        allRounder.numberOfWickets();
        allRounder.economyRate();
        allRounder.numberOfCatches();
        allRounder.numberOfRunOuts();
    }

    public static void main(String[] args) {

        Stats stats = new Stats();
        ScoreBoard scoreBoard = new ScoreBoard();

        stats.batsmenStats(scoreBoard);
        stats.bowlerStats(scoreBoard);
        stats.fielderStats(scoreBoard);
        stats.PlayerProfile(scoreBoard);
    }
}
