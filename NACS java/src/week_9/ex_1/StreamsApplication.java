package week_9.ex_1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsApplication {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int num = 1; num < 21; num++) {
            numbers.add(num);
        }
        System.out.println(numbers);

        List<Integer> even = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + even);

        List<Integer> odd = numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers: " + odd);


        List<Integer> divisibleBy3 = numbers.stream()
                .filter(e -> e > 10 && e % 3 == 0)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10: " + divisibleBy3);


        List<Integer> NumSmallThen5MultipliedBy3 = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3 :" + NumSmallThen5MultipliedBy3);

        List<String> numbersWithDigit = numbers.stream()
                .filter(e -> e > 8 && e < 12)
                .map(e -> e.toString())
                .map(e -> "number <" + e + "> has <" + e.length() + "> digits")
                .collect(Collectors.toList());


        System.out.println("Digits of numbers bigger than 8 and smaller than 12: " + numbersWithDigit);
    }
}


//    Create the StreamsApplication class. Write the next points of this exercise inside the main method.
//       1. Create a list of the first twenty numbers. Use a loop for this, please.
//       2.Create a list of the even numbers. Display it.
//       3.Create a list of the odd numbers. Display it.
//       4.Create a list of the numbers divisible by 3 and bigger than 10. Display it.
//       5.Create a list of the numbers smaller than 5 and multiply them by 3. Display it.
//       6.Create a list of String where every element follows the format “number <number> has <digit> digits”.
//        The numbers considered have to be bigger than 8 and smaller than 12. Display it.
