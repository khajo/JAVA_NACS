package week_10.ex_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterReaderTest {
    CharacterReader characterReader = new CharacterReader();


    @Test
    void testGetCharacters() {
        System.out.println(characterReader.getCharacters());

    }
}