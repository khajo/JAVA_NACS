package week_10.reflection;

import ex9.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceSummarizer {
    private FileReader reader=new FileReader();



    public List<String> getLines() {
        return reader.asStream("week_10/reflection/alice.txt")
                .collect(Collectors.toList());
    }

    public List<String> getWords() {
        return getLines().stream()
                .flatMap(e -> Stream.of(e.split(" ")))
                .map(e->e.toLowerCase())
                .map(e -> e.replaceAll("\\.", ""))
               .map(e -> e.replaceAll(",", ""))
                .map(e -> e.replaceAll(";", ""))
                .map(e -> e.replaceAll("’s", ""))
                .map(e -> e.replaceAll("'", ""))
                .map(e -> e.replaceAll("‘", ""))
                .map(e -> e.replaceAll(":", ""))
                .map(e -> e.replaceAll("#", ""))
                .map(e -> e.replaceAll("/", ""))
                .map(e -> e.replaceAll("-", ""))
                .map(e -> e.replaceAll("\\*", ""))
                .map(e -> e.replaceAll("\\(", ""))
                .map(e -> e.replaceAll("\\)", ""))
                .map(e -> e.replaceAll("\\[", ""))
               .map(e -> e.replaceAll("]", ""))
                .filter(e->!e.equals(""))
                .collect(Collectors.toList());

    }


}

