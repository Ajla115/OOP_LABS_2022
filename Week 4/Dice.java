package com.Week4;
/*The constructor Dice(int numberOfSides) creates a new dice object that has the amount of
sides defined by the argument.The method roll tells the result of a roll
(which depends on the number of its sides). The frame of the program is as follows:  */
import java.util.Random;
public class Dice {
        private Random random;
        private int numberOfSides;

        public Dice(int numberOfSides){
            this.numberOfSides = numberOfSides;
            random = new Random();

        }

    public int roll(){
        return random.nextInt(this.numberOfSides)+1;
    }
    //+1 is added at the end bc rage is from 1 to numberOfSides, and the end is not included so to include it, add +1 at the end

    public String toString(){
        return "Number of sides = " + this.numberOfSides;
    }
}

