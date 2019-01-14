package week_6.src.coffeeMaker;

public class Coffe {
    private String madeBy;
    private Integer brewedTime;

    public Coffe(String madeBy, Integer brewedTime) {
        this.madeBy = madeBy;
        this.brewedTime = brewedTime;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public Integer getBrewedTime() {
        return brewedTime;
    }


}
