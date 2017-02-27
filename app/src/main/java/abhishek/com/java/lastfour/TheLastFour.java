package abhishek.com.java.lastfour;

import java.util.ArrayList;

/**
 * Created by abhishek on 15/12/16.
 */

public class TheLastFour {

    private static ArrayList<Player> playerList;
    private static ArrayList<Integer> playerStack;
    private static String[] playerName = {"Kirat Boli","NS Nodhi","R Rumrah","Shashi Henra"};


    /* In this 2-D array row refers to the respective players and
     column refers to the weights/chance of getting 0(dot ball),1,2,...7(out)*/

    private static int[][] playerRunWeight = {
            {5,30,25,10,15,1,9,5},          //kirat boli
            {10,40,20,5,10,1,4,10},         //NS Nodhi
            {20,30,15,5,5,1,4,20},          //R Rumrah
            {30,25,5,0,5,1,4,30}            // Shashi Henra
    };


    private int TOTAL_OVERS = 4;
    private int WICKETS_IN_HAND = 3;
    private int TOTAL_RUNS_TO_WIN = 40;
    private int TOTAL_RUNS_SCORED = 0;
    private int TOTAL_BALLS_LEFT = 24;


    public static void main(String[] args) {

        TheLastFour match = new TheLastFour();
        Balloutcome ball = new Balloutcome(playerRunWeight);
        PlayerCreator players = new PlayerCreator(playerName);

        playerList = players.initPlayers();
        playerStack = players.getPlayerStack();

        match.startMatch(ball);

    }



    private void startMatch(Balloutcome ball){
        int STRIKER = 0;

        Player player = playerList.get(STRIKER);
        player.setStatus(Player.STATUS.PLAYING);


        StringBuilder commentary = new StringBuilder();

        for(int i = 0 ; i < TOTAL_OVERS ; i++){

            commentary.append("\n\n\n");
            commentary.append(TOTAL_OVERS-i+" overs left. "+(TOTAL_RUNS_TO_WIN-TOTAL_RUNS_SCORED)+" runs to win \n\n\n");

            for(int j = 1 ; j <= 6 ; j++){

                if(WICKETS_IN_HAND < 1){
                    System.out.println("Lengaburu lost the match \n\n\n");
                    printMatchStats(commentary.toString());
                    return;
                }

                TOTAL_BALLS_LEFT--;
                int run = ball.ballToBatOutcome(STRIKER);
                player.setBallPlayed(player.getBallPlayed()+1);

                if(run % 2 != 0){
                    if(run == 7){ // 7 means out
                        commentary.append(i+"."+j+" "+player.getPlayerName()+" got out \n");
                        WICKETS_IN_HAND--;
                        player.setStatus(Player.STATUS.OUT);
                        playerStack.remove(STRIKER);
                        if(WICKETS_IN_HAND > 1  && j < 6)
                            player = playerList.get(playerStack.get(1));
                        continue;
                    }else{
                        STRIKER = STRIKER == 0 ? 1 : 0;
                        player = playerList.get(playerStack.get(STRIKER));

                    }
                }
                commentary.append(i+"."+j+" "+player.getPlayerName()+" scores "+run+" run \n");
                player.setRunScored(player.getRunScored()+run);
                player.setStatus(Player.STATUS.PLAYING);
                TOTAL_RUNS_SCORED += run;


                if(TOTAL_RUNS_SCORED >= TOTAL_RUNS_TO_WIN){

                    System.out.println("Lengaburu won by "+ WICKETS_IN_HAND+" wicket and "
                            +  TOTAL_BALLS_LEFT +" balls remaining\n\n\n");

                    printMatchStats(commentary.toString());

                    return;
                }
            }

            STRIKER = STRIKER == 0 ? 1 : 0;
            player = playerList.get(playerStack.get(STRIKER));

        }

    }

    private void printMatchStats(String commentary){
        for(int k = 0 ; k < playerList.size() ; k++){
            Player player1 = playerList.get(k);
            player1.printPlayerMatchStats();
        }
        System.out.println(commentary);
    }


}
