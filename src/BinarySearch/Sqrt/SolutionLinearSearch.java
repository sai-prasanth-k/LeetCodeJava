package BinarySearch.Sqrt;

class SolutionLinearSearch {
    public int mySqrt(int x) {
        if(x == 0 ) return 0;
        int i = 1 ;
        while(i<=x/i){
            if(x/i == i) return i;
            i++;
        }
        return i -1;
    }
}
