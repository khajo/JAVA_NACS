package week_7.sortNumbers;

import java.util.Collections;
import java.util.List;

public class SortNumbers {


    public Integer getBiggestNumebr(List<Integer> numbers) {
        Collections.sort(numbers);
        Integer size = numbers.size();
        Integer biggestNumber = numbers.get(size - 1);
        return biggestNumber;
    }

    public Integer getSmallestNumber(List<Integer> numbers) {
        Collections.sort(numbers);
        Integer sammalesNumber = numbers.get(0);
        return sammalesNumber;
    }

}
