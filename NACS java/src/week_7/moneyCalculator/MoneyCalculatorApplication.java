package week_7.moneyCalculator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoneyCalculatorApplication {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("Mustafa", "Hala", "Omar", "Norbert", "Paul", "Aizhana", "Riyad", "Tamara", "Tina", "Sahar");
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Map<String, Integer> collectedMoneyMap = new HashMap<>();
        collectedMoneyMap = moneyCalculator.getCollectedMoney(friends);
        System.out.println(collectedMoneyMap);
        System.out.println("The total money: "+moneyCalculator.getAccumulatedValue(collectedMoneyMap));

    }
}
