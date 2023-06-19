package PangramChecker;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    public static boolean isPangram(String input) {
        if (input.isEmpty()) {return false;}
        Map<Character, Integer> used = new HashMap<Character, Integer>();
        String inputnew = input.trim().toLowerCase();
        boolean pangram = true;
        for (char i = 'a'; i <= 'z'; i++) {
            if (!inputnew.contains(String.valueOf(Character.toLowerCase(i)))) {
                pangram = false;
                break;
            }
        }
        return pangram;

    }

}
