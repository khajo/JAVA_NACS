package week_6.src.iceCream;

public class CupIceCream extends IceCream {


    public CupIceCream(String falvor, String topping) {
        super(falvor, topping);
    }

    @Override
    public String eat() {
        return "“The " + getFalvor() + " ice-cream with" + getTopping() + "is eaten with a spoon. ";
    }
}
