package week_7.ex9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderFilterTest {
    ReaderFilter readerFilter = new ReaderFilter();


    @Test
    void testFilter() {
        String word1 = "Abbasid's+";
        String word2 = "K*ha+jo'sM91@Gmail.***''com**''";
        String expected1 = readerFilter.filter("Abbasid's");
     //   String expected2 = readerFilter.filter("Khajo'sM91Gmailcom");
        Assertions.assertEquals(word1,expected1);
        System.out.printf(expected1);
   //     Assertions.assertEquals(word2,expected2);
    //    System.out.println(expected2);
    }
}