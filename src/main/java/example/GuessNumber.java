package example;

import java.util.Arrays;

public class GuessNumber {
   public String guess(int[] inputGuess,int[] answer) {
       boolean isAllCorrect=true;
       if (Arrays.equals(inputGuess, answer)){
           return "aa";
       }
       return null;
   }
}
