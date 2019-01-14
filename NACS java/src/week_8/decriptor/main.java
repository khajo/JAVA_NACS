package week_8.decriptor;

import Week_4.ex9.FileReader;


import java.util.*;

public class main {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        List<String> lines = fileReader.getlines("week_8/decriptor/robomime.txt");
        Sensor sensor = new Sensor();
        List<String> tricks = new ArrayList<>();
        for (String line : lines) {
         Optional<String> trick = sensor.getDecripted(line);
            tricks.add(trick.get());
        }

        System.out.println(tricks);

        Set<String> stringSet = new HashSet<>(tricks);
        System.out.println(stringSet.size());
    }
}
