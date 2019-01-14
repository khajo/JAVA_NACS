package week_8.decriptor;


public class ExclamationMark implements Descriptor {

    @Override
    public String decriptor(String line) {
        String word = line.replace("!", "");

        return word;
    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("!");
    }
}
