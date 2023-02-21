package Strings.pangram;

import java.util.*;

class Sett {
    public boolean checkIfPangram(String sentence) {
        Set<Character> map = new HashSet<Character>();
        for(char current :sentence.toCharArray()){
            map.add(current);
        }
        return map.size() == 26;
    }
}
