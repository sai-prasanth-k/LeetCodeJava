package Strings.ReverseVowelString;

class Solution {
    public String reverseVowels(String s) {

        int start =0;
        int end = s.length()-1;
        char c[] = s.toCharArray();
        while (start<end){
            if(!isVowel(c[start])){
                start++;
            }else if(!isVowel(c[end])){
                end--;
            }else {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(c);
    }
    public static boolean isVowel(char c){
        return (c == 'a' ||c == 'A' ||c == 'e' ||c == 'E' ||c == 'i' ||c == 'I' ||c == 'o' ||c == 'O' ||c == 'u' ||c == 'U' );
    }
}