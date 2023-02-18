package Strings.ransomNote;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rLen = ransomNote.length();
        int mLen = magazine.length();
        if(rLen > mLen || rLen == 0) return false;
        char m[] = magazine.toCharArray();
        char r[] = ransomNote.toCharArray();

        for(char rn : r){
            if(magazine.contains(Character.toString(rn))) {
                magazine = magazine.replaceFirst(Character.toString(rn),"");
            } else {
                return false;
            }

        }
        return true;
    }
}
