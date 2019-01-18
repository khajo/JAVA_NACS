package week_6.iceCream;

public abstract class IceCream {

    private String falvor;
    private String topping;

    public IceCream(String falvor, String topping) {
        this.falvor = falvor;
        this.topping = topping;
    }

    public abstract String eat();

    public String getFalvor() {
        return falvor;
    }

    public String getTopping() {
        return topping;
    }
}
