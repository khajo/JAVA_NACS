package week_6.src.money;

import java.util.List;
import java.util.Scanner;

public class changeApplication {
    public static void main(String[] args) {
        GreedyAlgorithm greedyAlgprithem = new GreedyAlgorithm();
        System.out.println("Input the money");
        Scanner scanner = new Scanner(System.in);
        Integer amount = scanner.nextInt();
        List<Money> monies = greedyAlgprithem.change(amount);
        System.out.println(monies.size());
        System.out.println("*********************************");

        for (Money money : monies) {
            System.out.println(money.getCent());
        }



    }
}
