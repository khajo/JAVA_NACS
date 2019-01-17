package week_9.ex_4;


import ex9.FileReader;
import worldhappiness.HappinessRecord;

import java.util.Arrays;
import java.util.Comparator;

public class HappinessApplication {
    public static void main(String[] args) {

        new FileReader().asStream("Week_4/worldhappiness/world-happiness-2017.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> Arrays.asList(e))
                .map(e -> new HappinessRecord(e.get(0), Integer.valueOf(e.get(1)), Double.valueOf(e.get(2))))
                .sorted(Comparator.comparing(e -> e.getRank()))
                .limit(5)
                .forEach(e -> System.out.println(e));

    }
}
