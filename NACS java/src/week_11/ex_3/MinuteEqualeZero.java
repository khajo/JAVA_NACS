package week_11.ex_3;

import java.util.ArrayList;
import java.util.List;

public class MinuteEqualeZero  implements Converter {


    @Override
    public List<Integer> getTime(Integer houre, Integer minute) {
        List<Integer> timeList = new ArrayList<>();
        if (minute == 0) {
            timeList.add(houre);
            timeList.add(minute);
        }
        return timeList;
    }
}
