package week_6.src.ikea;

public class AddDoor implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("door");
    }
}
