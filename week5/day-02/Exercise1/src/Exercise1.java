import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    List<Integer> listOfEvenNumbers = numbers.stream()
            .filter(n -> Math.abs(n) % 2 == 0)
            .collect(Collectors.toList());
    System.out.println(listOfEvenNumbers);


  }

}
