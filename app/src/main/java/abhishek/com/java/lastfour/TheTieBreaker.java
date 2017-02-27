package abhishek.com.java.lastfour;

import java.util.ArrayList;

/**
 * Created by abhishek on 17/12/16.
 */

public class TheTieBreaker {

    private static   String[] lengaburuPlayers = {"Kirat Boli","NS Nodhi"};
    private static String[] enchaiPlayers =      {"DB Vellyers","H Mamla"};

    private static  int[][] lengaburuPlayersRunWeight = {
            {5,10,25,10,25,1,14,10},          //kirat boli
            {5,15,15,10,20,1,19,15},          //NS Nodhi

    };

    private static  int[][] enchaiPlayersRunWeight = {
            {5,10,25,10,25,1,14,10},           //DB Vellyers
            {10,15,15,10,20,1,19,10},          //H Mamla

    };


    public static void main(String[] args) {

        TheTieBreaker breaker = new TheTieBreaker();
        ArrayList<Team> teams = new ArrayList<>(2);
        teams.add(new Team("Lengaburu",new PlayerCreator(lengaburuPlayers).initPlayers(),new Balloutcome(lengaburuPlayersRunWeight),0,0));
        teams.add(new Team("Enchai",new PlayerCreator(enchaiPlayers).initPlayers(),new Balloutcome(enchaiPlayersRunWeight),0,0));

        breaker.startMatch(teams);

    }

    private void startMatch(ArrayList<Team> teams){

        StringBuilder commentary = new StringBuilder();

        for (int j = 0 ; j < teams.size() ; j++){

            Team team = teams.get(j);
            ArrayList<Player> playerList = team.getPlayerList();
            Balloutcome balloutcome = team.getBallToBatOutcome();

            int STRIKER = 0;
            playerList.get(1).setStatus(Player.STATUS.PLAYING);
            Player player = playerList.get(STRIKER);
            player.setStatus(Player.STATUS.PLAYING);


            commentary.append(team.printTeamStats());

            for(int i = 1 ; i <= 6 ; i++) {

                int run = balloutcome.ballToBatOutcome(STRIKER);
                player.setBallPlayed(player.getBallPlayed()+1);
                team.setNoOfBallPlayed(team.getNoOfBallPlayed()+1);


                if (run % 2 == 0) {
                    if(run == 4)
                        commentary.append("0."+i+" "+player.getPlayerName()+" scores "+run+" run!\n");   // for !
                    else
                        commentary.append("0."+i+" "+player.getPlayerName()+" scores "+run+" run\n");

                } else {
                    if(run == 7){
                        player.setStatus(Player.STATUS.OUT);
                        commentary.append("0."+j+" "+player.getPlayerName()+" gets out! "+team.getTeamName()+" all out\n");
                        break;
                    }
                    commentary.append("0."+i+" "+player.getPlayerName()+" scores "+run+" run\n");
                    STRIKER = STRIKER == 0 ? 1 : 0;
                    player = playerList.get(STRIKER);
                }
                player.setRunScored(player.getRunScored() + run);
                player.setStatus(Player.STATUS.PLAYING);
                team.setTotalRun(team.getTotalRun()+run);
            }
            commentary.append("\n\n");
        }
        printMatchStats(teams,commentary.toString());

    }

    private void printMatchStats(ArrayList<Team> teams,String commentary){

        if(teams.get(0).getTotalRun() > teams.get(1).getTotalRun())
            System.out.println("Lengaburu won with "+(6-teams.get(0).getNoOfBallPlayed())+" balls remaining\n\n\n");
        else if(teams.get(0).getTotalRun() > teams.get(1).getTotalRun())
            System.out.println("Match is drawn \n\n\n");
        else
            System.out.println("Enchai won with "+(6-teams.get(0).getNoOfBallPlayed())+" balls remaining\n\n\n");


        for(int i = 0 ; i < 2 ;i++){
            teams.get(i).getPlayerList().get(0).printPlayerMatchStats();
            teams.get(i).getPlayerList().get(1).printPlayerMatchStats();
        }

        System.out.println("\n\n\n");
        System.out.println(commentary);

    }


}
