package week_10.reflection;

public class Main {
    public static void main(String[] args) {
        AliceSummarizer aliceSummarizer = new AliceSummarizer();
        System.out.println(aliceSummarizer.getLines());
        System.out.println(aliceSummarizer.getWords());
        System.out.println(aliceSummarizer.getWords().size());
    }
}
