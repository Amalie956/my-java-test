package assignment2;

import java.util.Random;

public class FlipCoin {

    /**
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {
        //TODO Delete line below, and implement this method
        FlipCoin coin = new FlipCoin();
        int min = 0;
        int max = 2;
        int value = (int) (Math.random() * (max - min)) + min;
        return value;
    }
}
