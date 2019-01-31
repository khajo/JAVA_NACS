package week_11.ex_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveTest {
    Remove remove = new Remove();


    @Test
    void getLeftOverLetters() {

    }

    @Test
    void isValid() {
        Boolean letter = remove.isValid("pale", "ple");
        System.out.println(letter);
        Boolean expected = true ;
        Assertions.assertEquals(expected,letter);


    }
}