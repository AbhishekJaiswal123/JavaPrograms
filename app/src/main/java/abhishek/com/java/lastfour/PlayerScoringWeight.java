package abhishek.com.java.lastfour;

/**
 * Created by abhishek on 16/12/16.
 */

public class PlayerScoringWeight {

    private int value;
    private int percentage;


    PlayerScoringWeight(int value,int percentage){
        this.value = value;
        this.percentage = percentage;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
