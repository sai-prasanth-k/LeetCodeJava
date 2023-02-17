package LastWordLength;

class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int lastIndex = str.lastIndexOf(' ') + 1;
        return str.length() - lastIndex;

    }
}
