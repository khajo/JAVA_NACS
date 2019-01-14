package week_7.nickname;

import java.util.Optional;

public class Nickname {

    public Optional<String> getNickName(String name) {
        Integer lenght = name.length();
        if (lenght == 0) {
            return Optional.empty();
        }
        if (lenght == 1) {
            return Optional.of(name);
        }
        Integer middle = lenght / 2;
        String nickName = name.substring(0, middle);
        return Optional.of(nickName);
    }
}
