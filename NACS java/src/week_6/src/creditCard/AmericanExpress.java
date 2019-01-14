package week_6.src.creditCard;

import java.util.Arrays;
import java.util.List;

public class AmericanExpress extends CreditCard {


    public AmericanExpress() {
        super(Arrays.asList(15), Arrays.asList(34,37));
    }

    @Override
    public String getName() {
        return "American Express";
    }

}
