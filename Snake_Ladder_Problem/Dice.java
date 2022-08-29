package Snake_Ladder_Problem;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int diceCount;
    int min=1;
    int max=6;

    public Dice(int diceCount){
        this.diceCount=diceCount;
    }

    public int rollDice(){
        int totalSum=0;
        int diceUsed=0;

        while(diceUsed<diceCount){
            totalSum+= ThreadLocalRandom.current().nextInt(min,max+1);
            diceUsed++;
        }
        return totalSum;
    }
}
