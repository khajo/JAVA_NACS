package week_8.decriptor;

public class AndMark implements Descriptor {

    @Override
    public String decriptor(String line) {
        String word = line.replace("&", "");
        word = reverse(word);
        return word;
    }

    private String reverse(String word) {
        Integer length = word.length();
        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        return reversed;
    }

    @Override
    public Boolean isThere(String line) {
        return line.contains("&");
    }
}
