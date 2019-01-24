package week_10.ex_4;

public class Main {
    public static void main(String[] args) {
        CharacterReader characterReader = new CharacterReader();
        GotSummarizer gotSummarizer = new GotSummarizer();
        System.out.println(characterReader.getCharacters());
        System.out.println("All the Chareczers: "+ gotSummarizer.getCharacters());
        System.out.println("Died characters: "+gotSummarizer.getDiedCharacters());
        System.out.println("percentage of men and women that died in all books: "+ gotSummarizer.getPercentageDiedManAndWomen());
        System.out.println(" The biggest death book: "+ gotSummarizer.getBiggestDeathBook());
        System.out.println("The names who died: "+ gotSummarizer.getdiedNames());
        System.out.println("allegiances that have the biggest dead count" + gotSummarizer.getAllegiancesHaveBiggestDeadCount());
        System.out.println(gotSummarizer.getDeathsBelongToNobility());
        System.out.println("characters from the Stark allegiance: "+gotSummarizer.getCharactersFromStarkAllegiance());
    }
}
