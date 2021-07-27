package gg.arcanecici.mongoflooder.data;

import gg.arcanecici.mongoflooder.MongoFlooder;

import java.util.Random;

/**
 * @author ArcaneCiCi ~ Best CheatBreaker Developer WorldWide <3
 */

public class Data {
    static String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public String getEncryptedString(String string) {
        return string.replace("a", "ᚫ").replace("b", "ᛂ").replace("c", "ᛟ")
                .replace("d", "ᛋ").replace("e", "ᚱ").replace("f", "ᛗ")
                .replace("g", "ᚣ").replace("h", "ᛚ").replace("i", "ᚩ")
                .replace("j", "ᚻ").replace("k", "ᚳ").replace("l", "ᚦ")
                .replace("m", "ᚷ").replace("n", "ᚹ").replace("o", "ᛉ")
                .replace("q", "ᚪ").replace("r", "ᛁ").replace("s", "ᛈ")
                .replace("t", "ᛞ").replace("u", "ᚢ").replace("v", "ᚾ")
                .replace("w", "ᚠ").replace("x", "ᛡ").replace("y", "ᛏ")
                .replace("z", "ᛇ").replace(" ", "ᛒ");
    }

    public String getRandomizedData() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 23; i++) {
            Random tick = new Random();
            int pos = tick.nextInt(alphabet.length);
            stringBuilder.append(alphabet[pos]);
        }

        String fileName = stringBuilder.toString();
        StringBuilder buffer = new StringBuilder();

        for (Character s : fileName.toCharArray()) {
            buffer.append(s);
        }

        return buffer.toString();
    }

}
