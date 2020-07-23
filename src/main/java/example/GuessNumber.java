package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuessNumber {
   public String guess(List inputGuess,List answer) {
       if (isAllCorrect(inputGuess, answer)) return "4A0B";
       if(isOutput2A2B(inputGuess,answer)) return "2A2B";
       return null;
   }

    private boolean isAllCorrect(List inputGuess, List answer) {
        boolean isAllCorrect = true;
        int count=0;
        for (int index = 0; index < 4; index++) {
            if (inputGuess.get(index) == answer.get(index)) {
                count++;
            }

        }
        return count==4;
    }
    private boolean isOutput2A2B(List inputGuess, List answer) {
        boolean isAllCorrect=true;
        int countA=0;
        int countB=0;
       for(int index=0;index<4;index++){
           if(inputGuess.get(index)==answer.get(index)){
               countA++;
           }
       }

        if(isEqualsList(inputGuess,answer)){
           countB=4-countA;
       }
        return countA==2&&countB==2;
    }
    private boolean isEqualsList(List inputGuess,List answer){
       for(int i=0;i<4;i++){
           if(!inputGuess.contains(answer.get(i))){
               return false;
           };
       }
      return true;
    }
}
