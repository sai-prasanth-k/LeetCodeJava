package IsomorphicString;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> count = new HashMap();
        char c = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (count.containsKey(s.charAt(i))) {
                c = count.get(s.charAt(i));
                if (c != t.charAt(i))
                    return false;
            }
            else if (!count.containsValue(t.charAt(i))) {
                count.put(s.charAt(i),t.charAt(i));
            }else {
                return false;
            }
        }
        return true;
    }
}
