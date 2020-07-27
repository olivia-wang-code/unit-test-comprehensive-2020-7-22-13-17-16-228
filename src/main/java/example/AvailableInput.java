package example;
import java.util.List;

public class AvailableInput {
   public Boolean isValid(List<Integer> guess) {
      int temp=guess.get(0);
      for (int i = 1; i < 4; i++) {
         if (temp == guess.get(i)) {
            return false;
         }
         temp = guess.get(i);
      }
      return true;
   }
}
