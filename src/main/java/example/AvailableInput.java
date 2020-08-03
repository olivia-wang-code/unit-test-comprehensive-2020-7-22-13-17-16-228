package example;

import java.util.List;

public class AvailableInput {
    public Boolean isValid(List<Integer> guess) {
        int validGuessLength = 4;
        if (guess.size() != validGuessLength) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++)
                if (guess.get(i).intValue() == guess.get(j).intValue()) return false;
        }
        return true;
    }
}
