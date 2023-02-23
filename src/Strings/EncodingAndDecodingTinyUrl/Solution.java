package Strings.EncodingAndDecodingTinyUrl;

import java.util.HashMap;

public class Solution {
    HashMap<String, String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder str = new StringBuilder();
        str.append((char)(Math.floor(Math.random()*100)));
        while(map.containsKey(str.toString())){
            str.append((char)(Math.floor(Math.random()*100)));
        }
        map.put(str.toString(),longUrl);
        return str.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
