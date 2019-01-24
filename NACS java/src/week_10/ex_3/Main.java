package week_10.ex_3;

import java.util.List;


public class Main {
    public static void main(String[] args) {


        Statstic statstic = new Statstic();

        List<String> ratioList = statstic.getRatio();
        System.out.println("Ham/spam ratio: "+ratioList.get(0)+" "+ratioList.get(1));
        System.out.println("Most used ham word:  "+statstic.mostUsedHamWord());
     //   System.out.println("Most used ham letter: "+statstic.mostUsedLetterInHam());
        if (statstic.mostUsedLetterInHam().isPresent()) {
            System.out.println("Most appearing word: "+statstic.mostUsedLetterInHam().get());
            if (statstic.longestSpamMessage().isPresent()) {
                System.out.println("Longest spam message: "+statstic.longestSpamMessage().get());
            }
        }
    }


}
