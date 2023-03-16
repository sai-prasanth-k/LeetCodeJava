package Strings.CountAndSay;

public class Solution {

    public String countAndSay(int n){
        String s = "1";
        for (int i = 2; i <= n;i++){
            s = countIndex(s);
        }
        return s;
    }

    public String countIndex(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int c = s.charAt(0);
        for(int i = 1 ; i <s.length();i++){
            if(s.charAt(i) == c){
                count++;
            }else{
                sb.append(count);
                sb.append(c);
                c =s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}
