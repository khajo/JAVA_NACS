package week_6.src.individual;

import java.util.List;

public class IndividualNumberApplication {
    public static void main(String[] args) {
        IndividualNumbers individualNumbers = new IndividualNumbers();
        List<Integer> numbers = individualNumbers.getIndividualList(4653);
        System.out.println(numbers);
    }
}
