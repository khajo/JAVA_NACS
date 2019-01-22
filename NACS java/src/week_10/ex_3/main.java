package week_10.ex_3;

import java.util.List;


public class main {
    public static void main(String[] args) {


        Statstic statstic = new Statstic();

        List<String> ratioList = statstic.getRatio();
        System.out.println("Ham/spam ratio: "+ratioList.get(0)+" "+ratioList.get(1));
        System.out.println(statstic.mostUsedHamWord());
    }


}
