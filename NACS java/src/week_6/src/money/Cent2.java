package week_6.src.money;

public class Cent2 extends Money {

    public Cent2(Integer cent) {
        super(cent);
    }

    @Override
    public Boolean isApplicable(Integer amount) {
        return amount >= 2;
    }
}
