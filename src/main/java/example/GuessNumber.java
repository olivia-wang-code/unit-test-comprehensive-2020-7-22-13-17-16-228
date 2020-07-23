package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuessNumber {
   public String guess(List inputGuess,List answer) {
       if (isAllCorrect(inputGuess, answer)) return "4A0B";
       if(isOutput2A2B(inputGuess,answer)) return "2A2B";
       if(isOutput0A4B(inputGuess,answer)) return "0A4B";
       if(isOutput0A0B(inputGuess,answer)) return "0A0B";
       if(isOutput1A0B(inputGuess,answer)) return "1A0B";
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
    private boolean isOutput0A4B(List inputGuess, List answer) {
        boolean isAllCorrect = true;
        int count=0;
        for (int index = 0; index < 4; index++) {
            if (inputGuess.get(index) != answer.get(index)) {
                count++;
            }
        }
        return count==4&&isEqualsList(inputGuess,answer);
    }
    private boolean isOutput0A0B(List inputGuess, List answer) {
       int count=0;
        for(int i=0;i<4;i++){
            if(!inputGuess.contains(answer.get(i))){
                count++;
            }
        }
        return count==4;
    }
    private boolean isOutput1A0B(List inputGuess, List answer) {
       int count=0;
        List newList1=new ArrayList();
        List newList2=new ArrayList();
        newList1.addAll(inputGuess);
        newList2.addAll(answer);
        for(int i=0;i<4;i++){
            if(inputGuess.get(i)==answer.get(i)){
                newList1.remove(i);
                newList2.remove(i);
            }
        }
        for(int i=0;i<3;i++){
            if(!newList1.contains(newList2.get(i))){
                count++;
            }
        }
        return count==3;
    }
}
