import example.GuessNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    @Test
    void should_return_4AOB_when_guess_give_answer_1234_and_input_guess_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        //»¨À¨ºÅ
        int[] answer = {1, 2, 3, 4};
        int[] inputGuess = {1, 2, 3, 4};
        //when
        String result = guessNumber.guess(inputGuess, answer);
        //then
        assertEquals("4A0B", result);
    }
    @Test
    void should_return_2A2B_when_guess_give_answer_1234_and_input_guess_1324() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        //»¨À¨ºÅ
        int[] answer = {1, 2, 3, 4};
        int[] inputGuess = {1, 3, 2, 4};
        //when
        String result = guessNumber.guess(inputGuess, answer);
        //then
        assertEquals("2A2B", result);
        }
}

