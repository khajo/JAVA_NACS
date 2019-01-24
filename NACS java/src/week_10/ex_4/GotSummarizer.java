package week_10.ex_4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GotSummarizer {
    CharacterReader characterReader = new CharacterReader();
    List<Character> characters = characterReader.getCharacters();

    public Long getCharacters() {
        return characters.stream()
                .count();
    }

    public long getDiedCharacters() {
        return characters.stream()
                .map(Character::getBookOfDeath)
                .filter(e -> !e.equals(""))
                .count();
    }

    public List<String> getPercentageDiedManAndWomen() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().equals(""))
                .map(e -> e.getGender())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getKey() + " " + (e.getValue() * 100) / getDiedCharacters() + " %")
                .collect(Collectors.toList());

    }

    public String getBiggestDeathBook() {
        Optional<String> biggestDeathBook = characters.stream()
                .map(e -> e.getBookOfDeath())
                .filter(e -> !e.equals(""))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " || " + e.getValue())
                .findFirst();
        if (biggestDeathBook.isPresent()) {
            return biggestDeathBook.get();
        }
        return " there is no";
    }

    public List<String> getdiedNames() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().equals(""))
                .map(e -> e.getName() + " || in Book " + e.getBookOfDeath())
                .collect(Collectors.toList());
    }

    public List<String> getAllegiancesHaveBiggestDeadCount() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().equals(""))
                .map(e -> e.getAllegiances())
                .filter(e -> !e.equalsIgnoreCase("None"))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }

    public String getDeathsBelongToNobility() {
        Optional<Long> nobiltyDeathCharacters = characters.stream()
                .filter(e -> !e.getBookOfDeath().equals(""))
                .filter(e -> e.getNobility().equals("1"))
                .map(e -> e.getNobility())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> ((e.getValue() * 100) )/ getDiedCharacters())
                .findFirst();
        if (nobiltyDeathCharacters.isPresent()) {
            return "deaths belong to nobility characters " + nobiltyDeathCharacters.get()+ "%";
        }
        return "no";
    }
    public List<String> getCharactersFromStarkAllegiance() {
        return characters.stream()
                .filter(e->!e.getBookOfDeath().equals(""))
                .filter(e->e.getAllegiances().equalsIgnoreCase("Stark"))
                .map(e->e.getBookOfDeath())
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                .map(e->e.getKey()+" | "+e.getValue())
                .limit(1)
                .collect(Collectors.toList());
    }


}
