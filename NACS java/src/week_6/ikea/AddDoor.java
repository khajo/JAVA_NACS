package week_6.ikea;

public class AddDoor implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("door");
    }
}
