package week_6.src.money;

public class Cent10 extends Money {

    public Cent10(Integer cent) {
        super(cent);
    }

    @Override
    public Boolean isApplicable(Integer amount) {
        return amount >= 10;
    }
}
