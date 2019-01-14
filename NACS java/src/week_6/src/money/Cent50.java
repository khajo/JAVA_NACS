package week_6.src.money;

public class Cent50 extends Money {

    public Cent50(Integer cent) {
        super(cent);
    }

    @Override
    public Boolean isApplicable(Integer amount) {
        return amount >= 50;
    }

}
