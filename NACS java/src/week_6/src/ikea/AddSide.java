package week_6.src.ikea;

public class AddSide implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("side");
    }
}
