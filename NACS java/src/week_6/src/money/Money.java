package week_6.src.money;

public abstract class Money {

    private  Integer cent;

    public Money(Integer cent) {
        this.cent = cent;
    }

    public Integer getCent() {
        return cent;
    }

    public abstract Boolean isApplicable(Integer amount);
}
