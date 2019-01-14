package week_8.decriptor;

public class HashtagMark implements Descriptor {
    @Override
    public String decriptor(String line) {
        String word = line.replace("#", "");
        word = word.replace("robomime", "");

        return word;
    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("#");
    }
}
