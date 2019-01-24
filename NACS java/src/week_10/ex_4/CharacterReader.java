package week_10.ex_4;

import ex9.FileReader;
import got.Character;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterReader {
    FileReader reader = new FileReader();


    public List<Character> getCharacters() {
        return reader.asStream("week_4/got/got-characters.csv")
                .skip(1)
                .map(e->e.split(";"))
        //        .filter(e->e[6].equals("1")==e.equals("man"))
        //        .filter(e->e[6].equals("0")==e.equals("women"))
                .map(e-> new Character(e[0],e[3],e[6]))
                .collect(Collectors.toList());
    }
}
