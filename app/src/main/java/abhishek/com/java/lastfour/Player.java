package abhishek.com.java.lastfour;

/**
 * Created by abhishek on 15/12/16.
 */

public class Player {

    private String playerName;
    private int ballPlayed;
    private int runScored;
    private STATUS status;

    public enum STATUS { PLAYING, OUT, STILL_TO_PLAY };

    Player(String playerName, int ballPlayed, int runScored, STATUS status){
        this.playerName = playerName;
        this.ballPlayed = ballPlayed;
        this.runScored = runScored;
        this.status = status;
    }

    public void printPlayerMatchStats(){
        if(status.equals(Player.STATUS.PLAYING)){
            System.out.println(playerName+"- "+runScored+"*("+ballPlayed+")");
        }else{
            System.out.println(playerName+"- "+runScored+"("+ballPlayed+")");
        }

    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getBallPlayed() {
        return ballPlayed;
    }

    public void setBallPlayed(int ballPlayed) {
        this.ballPlayed = ballPlayed;
    }

    public int getRunScored() {
        return runScored;
    }

    public void setRunScored(int runScored) {
        this.runScored = runScored;
    }
}
