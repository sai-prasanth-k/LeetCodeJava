package Strings.SortASentence;

class Solution {
    public String sortSentence(String s) {
        String[] words =s.split(" ");
        int len = words.length;
        String[] ans = new String[len];
        for(String word: words)
        {
            ans[word.charAt(word.length()-1) - '1'] = word.substring(0,word.length()-1);
        }
        return String.join(" ",ans);
    }
}
