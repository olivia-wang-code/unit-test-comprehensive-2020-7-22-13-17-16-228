import example.GuessNumber;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    @Test
    void should_return_4AOB_when_guess_give_answer_1234_and_input_guess_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        //»¨À¨ºÅ
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(1, 2, 3, 4);
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
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(1, 3, 2, 4);
        //when
        String result = guessNumber.guess(inputGuess, answer);
        //then
        assertEquals("2A2B", result);
        }
    @Test
    void should_return_0A4B_when_guess_give_answer_1234_and_input_guess_4321() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        //»¨À¨ºÅ
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(4,3,2,1);
        //when
        String result = guessNumber.guess(inputGuess, answer);
        //then
        assertEquals("0A4B", result);
    }
    @Test
    void should_return_0A0B_when_guess_give_answer_1234_and_input_guess_5678() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        //»¨À¨ºÅ
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(5,6,7,8);
        //when
        String result = guessNumber.guess(inputGuess, answer);
        //then
        assertEquals("0A0B", result);
    }
    @Test
    void should_return_1A0B_when_guess_give_answer_1234_and_input_guess_1756() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        //»¨À¨ºÅ
        List<Integer> answer = Arrays.asList(1, 2, 3, 4);
        List<Integer> inputGuess = Arrays.asList(1,7,5,6);
        //when
        String result = guessNumber.guess(inputGuess, answer);
        //then
        assertEquals("1A0B", result);
    }
}

