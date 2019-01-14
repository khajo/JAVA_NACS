package week_6.src.ikea;

public class AddBottom implements Step {


    @Override
    public void perform(Furniture furniture) {
        furniture.add("bottom");
    }
}
