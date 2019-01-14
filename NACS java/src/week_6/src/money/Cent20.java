package week_6.src.money;

public class Cent20 extends Money {

    public Cent20(Integer cent) {
        super(cent);
    }

    @Override
    public Boolean isApplicable(Integer amount) {
        return amount >= 20;
    }
}
