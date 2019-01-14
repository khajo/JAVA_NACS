package week_6.src.iceCream;

public class ConeIceCream extends IceCream {


    public ConeIceCream(String falvor, String topping) {
        super(falvor, topping);
    }

    @Override
    public String eat() {
        String message = "The " + getFalvor() + " ice-cream with " + getTopping() + " is licked";
        return message;
    }
}
