package Strings.DecodeTheMessage;

import java.util.HashMap;

class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder str = new StringBuilder();
        key = key.replace(" ", "");
        HashMap<Character,Character> map = new HashMap<>();

        char c = 'a';
        for(int i= 0; i< key.length();i++){
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),c++);
            }
        }
        for(int i =0; i<message.length();i++){
            if(map.containsKey(message.charAt(i))){
                str.append(map.get(message.charAt(i)));
            }else {
                str.append(message.charAt(i));
            }
        }

        return str.toString();
    }
}