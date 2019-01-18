package week_6.ikea;

public class AddBack implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("back");
    }
}
