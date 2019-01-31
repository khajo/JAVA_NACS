package week_11.ex_3;

import java.util.Arrays;
import java.util.List;

public class Converters {
   private static List <Converter> converters = Arrays.asList(new MinuteEqualeZero(), new MinuteLessThanThirty(), new MinuteMoreThanThirty());


   public static  List<Converter> getConverters() {
       return converters;
   }

}
