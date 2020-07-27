package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuessNumber {
    private int guessNumber=0;

    public GuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public GuessNumber() {
        this.guessNumber = guessNumber;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public String guess(List<Integer> inputGuess, List<Integer> answer) {

        boolean isAllCorrect = true;
        int countA = 0;
        int countB = 0;
        for (int index = 0; index < 4; index++) {
            if (inputGuess.get(index).equals(answer.get(index))) {
                countA++;
                continue;
            }
            if (inputGuess.contains(answer.get(index))) {
                countB++;
            }

        }
        return String.format("%sA%sB", countA, countB);
    }
    public Boolean guessTimes(){
        this.guessNumber++;
        if (this.guessNumber > 6) {
            return false;
        }
        return true;
    }
}

