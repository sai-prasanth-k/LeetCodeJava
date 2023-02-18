package Strings.DefangingIP;

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder deFang = new StringBuilder();
        int addressLen = address.length();
        for(int i = 0; i<addressLen;i++){
            char c = address.charAt(i);
            if(c == '.'){
                deFang.append("[.]");
            }else {
                deFang.append(c);
            }
        }
        return deFang.toString();
    }
}
