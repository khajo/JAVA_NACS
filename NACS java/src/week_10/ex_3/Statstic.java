package week_10.ex_3;

import ex9.FileReader;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Statstic {

    FileReader reader = new FileReader();

    public Optional<Integer> longestSpamMessage() {
        return getAll().stream()
                .map(e -> e.split(";"))
                .filter(e -> e[0].equals("spam"))
                .map(e -> e[1].length())
                .sorted(Comparator.reverseOrder())
                .findFirst();
    }


    public Optional<String> mostUsedLetterInHam() {
        Optional<String> letter = getAll().stream()
                .map(e -> e.split(";"))
                .filter(e -> e[0].equals("ham"))
                .map(e -> e[1])
                .map(e -> e.replaceAll(" ", ""))
                .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();
        return letter;
    }


    public String mostUsedHamWord() {
        return getAll().stream()
                .map(e -> e.split(";"))
                //             .filter(e -> e[0].equalsIgnoreCase("ham"))
                .map(e -> e[1])
                .map(e -> e.split(" "))
                .flatMap(e -> Stream.of(e))

//                .map(e -> e.replaceAll(",", ""))
//                .map(e -> e.replaceAll("\\.", ""))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> e.getKey())
                .collect(Collectors.joining());
    }

    public List<String> getRatio() {
        return reader.asStream("week_10/ex_3/sms.csv")
                .skip(1)
                .flatMap(e -> Stream.of(e))
                .map(e -> e.split(";"))
                .map(e -> e[0])
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getKey() + " " + e.getValue() * 100 / getAll().size() + " %")
                .collect(Collectors.toList());
    }

    public List<String> getAll() {
        return reader.asStream("week_10/ex_3/sms.csv")
                .skip(1)
                .flatMap(e -> Stream.of(e))
                //   .map(e -> e.split(";"))
                //   .map(e -> e[0])
                .collect(Collectors.toList());

    }


}
