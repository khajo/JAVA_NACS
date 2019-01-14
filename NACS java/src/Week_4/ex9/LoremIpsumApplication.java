package Week_4.ex9;

import Week_4.ex9.FileReader;

import java.util.List;

public class LoremIpsumApplication {

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        List<String> lines = reader.getlines("exercise/week4/ex9/lorem-ipsum.txt");
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
