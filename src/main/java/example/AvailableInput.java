package example;

import java.util.List;

public class AvailableInput {
    public Boolean isValid(List<Integer> guess) {
        int validGuessLength = 4;
        if (guess.size() != validGuessLength) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++)
                if (guess.get(i).intValue()==guess.get(j).intValue()) return false;
        }
        return true;
    }
}
