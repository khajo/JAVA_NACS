package week_7.nickname;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NicknameTest {
    Nickname nickname = new Nickname();

    @Test
    void testGetNickName() {
        String name = "kha";
        assertEquals(name,nickname.getNickName("khajag").get());
    }
    @Test
    void testGetNickNameEmptey() {
        assertEquals(Optional.empty(),nickname.getNickName(""));
    }
    @Test
    void testGetNickNameOneLetter() {
        String name = "k";
        assertEquals(name, nickname.getNickName("k").get());
    }
}