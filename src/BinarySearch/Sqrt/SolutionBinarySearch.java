package BinarySearch.Sqrt;

public class SolutionBinarySearch {
        public int mySqrt(int x) {
            int low = 1 ;
            int high = x;
            int ans = 0;
            while(low<=high){
                int mid = low +(high - low)/2;
                if(x/mid == mid) return mid;
                if(x/mid<mid) {
                    high = mid-1;
                }else{
                    low = mid+1;
                    ans = mid;
                }
            }
            return ans;
        }
}
