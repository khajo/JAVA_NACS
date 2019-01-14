package week_8.decriptor;


import java.util.Arrays;
import java.util.List;

public class Decriptores {
    private static List<Descriptor> simpolies = Arrays.asList(new ExclamationMark(), new HashtagMark(), new AndMark());


    public static List<Descriptor> getDecriptor() {
        return simpolies;
    }
}
