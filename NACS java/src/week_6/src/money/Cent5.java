package week_6.src.money;

public class Cent5 extends Money {

    public Cent5(Integer cent) {
        super(cent);
    }

    @Override
    public Boolean isApplicable(Integer amount) {
        return amount >= 5;
    }
}
