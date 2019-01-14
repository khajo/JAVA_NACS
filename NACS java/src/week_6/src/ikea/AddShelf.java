package week_6.src.ikea;

public class AddShelf implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("shelf");
    }
}
