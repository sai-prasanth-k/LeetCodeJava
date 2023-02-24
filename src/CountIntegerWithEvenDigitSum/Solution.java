package CountIntegerWithEvenDigitSum;

class Solution {
    public int countEven(int num) {
        int count = 0,sum = 0,r = 0,cNum = 0;
        for (int i=1;i<= num;i++) {
            cNum = i;
            while (cNum != 0) {
                r = cNum % 10;
                sum = sum + r;
                cNum = cNum / 10;
            }
            if(sum % 2 == 0) count++;
            sum = 0;
        }
        return count;
    }
}
