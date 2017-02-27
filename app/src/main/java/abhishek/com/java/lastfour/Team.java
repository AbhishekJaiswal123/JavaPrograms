package abhishek.com.java.lastfour;

import java.util.ArrayList;

/**
 * Created by abhishek on 17/12/16.
 */

public class Team {

    private String teamName;
    private ArrayList<Player> playerList;
    private Balloutcome ballToBatOutcome;
    private int noOfBallPlayed;
    private int totalRun;


    Team(String teamName,ArrayList<Player> playerList,Balloutcome ballToBatOutcome,int noOfBallPlayed,int totalRun){
        this.teamName = teamName;
        this.playerList = playerList;
        this.ballToBatOutcome = ballToBatOutcome;
        this.noOfBallPlayed = noOfBallPlayed;
        this.totalRun = totalRun;
    }


    public String printTeamStats(){

        return teamName+" innings: \n";
    }


    public Balloutcome getBallToBatOutcome() {
        return ballToBatOutcome;
    }

    public void setBallToBatOutcome(Balloutcome ballToBatOutcome) {
        this.ballToBatOutcome = ballToBatOutcome;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public int getTotalRun() {
        return totalRun;
    }

    public void setTotalRun(int totalRun) {
        this.totalRun = totalRun;
    }

    public int getNoOfBallPlayed() {
        return noOfBallPlayed;
    }

    public void setNoOfBallPlayed(int noOfBallPlayed) {
        this.noOfBallPlayed = noOfBallPlayed;
    }
}
