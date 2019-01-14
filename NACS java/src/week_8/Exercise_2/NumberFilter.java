package week_8.Exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {


    public List<Integer> getEven(List<Integer> numbers) {
        Predicate<Integer> condiation = number -> number % 2 == 0;
        return filter(numbers, condiation);
    }

    public List<Integer> getOdd(List<Integer> numbers) {
        Predicate<Integer> condiation = number -> number % 2 != 0;
        return filter(numbers, condiation);
    }


    public List<Integer> filter(List<Integer> numbers, Predicate<Integer> condition) {
        List<Integer> filterd = new ArrayList<>();
        for (Integer number : numbers) {
            if (condition.test(number)) {
                filterd.add(number);
            }
        }
        return filterd;
    }

}
