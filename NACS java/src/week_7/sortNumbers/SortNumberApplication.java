package week_7.sortNumbers;


import java.util.Arrays;
import java.util.List;

public class SortNumberApplication {
    public static void main(String[] args) {
        SortNumbers sortNumbers = new SortNumbers();
        List<Integer> numbers = Arrays.asList(2,3,1,4,52,54,112,34,1);
        System.out.println("The biggest number is: "+sortNumbers.getBiggestNumebr(numbers));
        System.out.println("The smallest number is: "+sortNumbers.getSmallestNumber(numbers));
    }
}
