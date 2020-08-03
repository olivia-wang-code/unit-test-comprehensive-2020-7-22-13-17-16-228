package example;

import java.util.List;

public class AvailableInput {
    public Boolean isValid(List<Integer> guess) {
        int validGuessLength = 4;
        if (guess.size() != validGuessLength) {
            return false;
        }
        //stream流去重
        return guess.stream().distinct().count()==4;
    }
}
