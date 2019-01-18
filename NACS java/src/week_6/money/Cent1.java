package week_6.money;

public class Cent1 extends Money {

    public Cent1(Integer cent) {
        super(1);
    }

    @Override
    public Boolean isApplicable(Integer amount) {
        return amount>=1;
    }
}
