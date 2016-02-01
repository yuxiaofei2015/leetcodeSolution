package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuxiaofei on 2016/2/1.
 */
public class Q205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character characterT = mapS.get(s.charAt(i));
            Character characterS = mapT.get(t.charAt(i));
            if (characterT == null) {
                mapS.put(s.charAt(i), t.charAt(i));
            } else {
                if (characterT != t.charAt(i)) {
                    return false;
                }
            }
            if (characterS == null) {
                mapT.put(t.charAt(i), s.charAt(i));
            } else {
                if (characterS != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
