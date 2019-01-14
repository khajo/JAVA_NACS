package week_7.nickname;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NickNameApplication {
    public static void main(String[] args) {
        Nickname nickname = new Nickname();
        List<String> names = Arrays.asList("House", "t", "", "somewhere", "bottle");
        for (String name : names) {
            Optional<String> nickName = nickname.getNickName(name);
            if (nickName.isPresent()) {
                System.out.println(nickName.get());
            }
        }
    }
}
