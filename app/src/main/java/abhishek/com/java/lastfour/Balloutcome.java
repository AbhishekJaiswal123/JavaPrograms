package abhishek.com.java.lastfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by abhishek on 16/12/16.
 */

public class Balloutcome {

    private int[][] playerRunWeight;

    public  Balloutcome(int[][] playerRunWeight){
        this.playerRunWeight = playerRunWeight;
    }


    private ArrayList<PlayerScoringWeight> mapRunWithWeights(int player){

        ArrayList<PlayerScoringWeight> runWeights = new ArrayList<>();

        for(int i = 0 ; i <= 7 ; i++){
            runWeights.add(new PlayerScoringWeight(i,playerRunWeight[player][i]));
        }
        return runWeights;
    }



    public int ballToBatOutcome(int player) {

        List<PlayerScoringWeight> probabilityWeightList = mapRunWithWeights(player);

        int total = 0;
        for (PlayerScoringWeight w : probabilityWeightList) {
            total += w.getPercentage();
        }
        int random = new Random().nextInt(total);
        int current = 0;
        for (PlayerScoringWeight w : probabilityWeightList) {
            current += w.getPercentage();
            if (random < current)
                return w.getValue();
        }
        return 0;
    }
}
