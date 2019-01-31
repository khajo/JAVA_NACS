package week_11.ex_3;

import java.util.ArrayList;
import java.util.List;


public class Detector {

    List<Converter> converters = Converters.getConverters();

    public List<Integer> detect(Integer houre, Integer minute) {
        List<Integer> rightTime = new ArrayList<>();
        for (Converter converter : converters) {
           rightTime=  converter.getTime(houre, minute);
        }
        return rightTime;
    }


}
