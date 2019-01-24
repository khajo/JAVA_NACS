package week_10.ex_4;

import ex9.FileReader;


import java.util.List;
import java.util.stream.Collectors;


public class CharacterReader {
    FileReader reader = new FileReader();


    public List<Character> getCharacters() {
        return reader.asStream("week_10/ex_4/got-characters.csv")
                .skip(1)
                .map(e -> e.split(";"))
                //        .filter(e->e[6].equals("1")==e.equals("man"))
                //        .filter(e->e[6].equals("0")==e.equals("women"))
                .map(e -> new Character(e[0],e[1],e[2],e[3],e[4],e[5],define(e[6]),e[7],e[8],e[9],e[10],e[11],e[12]))
                //         .map(e-> new Character(e[0],e[1],Stream.of(e[6]).map(gender->define(gender)))
                .collect(Collectors.toList());
    }


    private String define(String gender) {
        if (gender.equalsIgnoreCase("1")) {

            return "man";
        }
        return "women";
    }

}
