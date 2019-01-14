package week_7.moneyCalculator;

import java.util.*;

public class MoneyCalculator {


    public Map<String, Integer> getCollectedMoney(List<String> friends) {
        Map<String, Integer> collectedMoney = new HashMap<>();
        for (String friend : friends) {
            Integer money = getmoney();
            collectedMoney.put(friend, money);
        }
        return collectedMoney;
    }

    public Integer getAccumulatedValue(Map<String, Integer> payments) {
        Integer amountMoney = 0;
        Collection<Integer> monies = payments.values();
        for (Integer money : monies) {
            amountMoney += money;
        }
        return amountMoney;
    }

    private Integer getmoney() {
        Random random = new Random();
        Integer money = random.nextInt(5) + 1;
        return money;
    }


}
