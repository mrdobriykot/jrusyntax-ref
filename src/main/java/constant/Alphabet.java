package constant;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    private Alphabet() {

    }

    private static final String rus = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
    private static final String symbols = ".,”’:-!? ";

    public static final char[] CHARS = (rus.toLowerCase() + symbols).toCharArray();

    public static final Map<Character, Integer> index = new HashMap<>();

    static {
        for (int i = 0; i < CHARS.length; i++) {
            index.put(CHARS[i], i);
        }
    }

}
