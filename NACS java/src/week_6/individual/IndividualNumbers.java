package week_6.individual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndividualNumbers {

    public List<Integer> getIndividualList(Integer number) {
        List<Integer> numbers = new ArrayList<>();
        List<String> splitedNumber = splited(number);
        for (String num : splitedNumber) {
            Integer numberOfIntager = Integer.valueOf(num);
            numbers.add(numberOfIntager);
        }
        return numbers;
    }

    public List<String> splited(Integer number) {
        String numberString = number.toString();
        String[] parts = numberString.split("");
        List<String> numbersOfString = Arrays.asList(parts);
        return numbersOfString;
    }
}
