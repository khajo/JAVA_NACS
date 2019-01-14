package week_6.src.money;

import java.util.ArrayList;
import java.util.List;

public class GreedyAlgorithm {
  private    List<Money> monies = new ArrayList<>();


    public List<Money> change( Integer amount) {
        List<Money> changes = Monies.getMonies();

        for (Money change : changes) {
            if(change.isApplicable(amount)){
                Integer times = amount / change.getCent();
                addMoney(times,change);
            }
            amount = amount % change.getCent();
        }



        return monies;
    }

    public void addMoney(Integer times,Money money) {
        for (int time = 0; time <times ; time++) {
            monies.add(money);
        }
    }

}
