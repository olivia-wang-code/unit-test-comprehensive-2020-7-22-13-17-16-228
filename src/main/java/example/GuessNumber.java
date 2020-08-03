package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuessNumber {
    private final List<Integer> answer;
    private int guessNumber=0;
    public GuessNumber(List<Integer> answer) {
        this.answer = answer;
    }

    public  List<Integer> getAnswer() {
        return answer;
    }
    public String calculate(List<Integer> inputGuess, List<Integer> answer) {
        int valueOfPositionCorrect = 0;
        int valueOfNumberCorrect = 0;
        for (int index = 0; index < 4; index++) {
            if (inputGuess.get(index).equals(answer.get(index))) {
                valueOfPositionCorrect++;
                continue;
            }
            if (inputGuess.contains(answer.get(index))) {
                valueOfNumberCorrect++;
            }

        }
        return String.format("%sA%sB", valueOfPositionCorrect, valueOfNumberCorrect);
    }
    public Boolean guessTimes(){
        this.guessNumber++;
        return this.guessNumber <= 6;
    }
}

