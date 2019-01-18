package week_6.ikea;

public class AddBottom implements Step {


    @Override
    public void perform(Furniture furniture) {
        furniture.add("bottom");
    }
}
