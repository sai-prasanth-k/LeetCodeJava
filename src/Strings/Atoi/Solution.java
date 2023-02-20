package Strings.Atoi;

class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int num;
        int sign = 1;
        boolean numStart = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                num = res;
                res = res * 10 + c - 48;
                if ((res + 48 - c) / 10 != num || res < 0) return sign < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                numStart = true;
            } else if (numStart) break;
            else {
                if (c == '-') {
                    numStart = true;
                    sign = -1;
                } else if (c == '+') numStart = true;
                else if (c != ' ') {
                    break;
                }
            }
        }
        return res * sign;
    }
}
