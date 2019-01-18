package week_6.ikea;

public class IkeaApplication {
    public static void main(String[] args) {
        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        Wardrobe wardrobe=   wardrobeBuilder.built();
        System.out.println(wardrobe);

    }
}
