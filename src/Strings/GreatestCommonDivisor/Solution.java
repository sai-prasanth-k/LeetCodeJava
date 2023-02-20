package Strings.GreatestCommonDivisor;

class Solution {
    public int gcd (int x, int y){
        if(y ==0){
            return x;
        }else {
            return gcd(y,x%y);
        }
    }

    public String gcdOfStrings(String str1, String str2) {
        int len1 =str1.length();
        int  len2 = str2.length();
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        int gcdLen = gcd(len1,len2);
        return str1.substring(0,gcdLen);
    }


}

