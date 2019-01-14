package week_6.src.ikea;

public class AddTop  implements  Step{

    @Override
    public void perform(Furniture furniture) {
furniture.add("top");
    }
}
