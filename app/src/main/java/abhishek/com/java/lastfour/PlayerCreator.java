package abhishek.com.java.lastfour;

import java.util.ArrayList;

/**
 * Created by abhishek on 17/12/16.
 */

public class PlayerCreator {

    private ArrayList<Player> players;
    private String[] playerName;

    public PlayerCreator(String[] playerName){
        this.playerName = playerName;
    }

    public ArrayList<Player> initPlayers(){
        players = new ArrayList<>();
        for(int i = 0 ; i < playerName.length ; i++){
            Player player = new Player(playerName[i],0,0,Player.STATUS.STILL_TO_PLAY);
            players.add(player);
        }
        return  players;
    }

    public  ArrayList<Integer> getPlayerStack(){
        ArrayList<Integer> playerStack = new ArrayList<>(playerName.length);
        for(int i = 0 ; i < playerName.length ; i++){
            playerStack.add(i);
        }
        return playerStack;
    }

}
