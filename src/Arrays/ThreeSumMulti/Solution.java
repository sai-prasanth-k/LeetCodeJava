package Arrays.ThreeSumMulti;

import java.util.*;
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int mod = 1_000_000_007;
        long ans = 0;
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length;++i){
            int t = target - arr[i];
            int start = i+1;
            int end = arr.length -1 ;
            while(start<end){
                if(arr[start] + arr[end]< t){
                    start++;
                }else if(arr[start] + arr[end]> t) {
                    end--;
                }else if(arr[start] != arr[end]){
                    int left = 1 ,right = 1;
                    while(start +1 < end && arr[start] == arr[start +1]){
                        left++;
                        start++;
                    }
                    while(end -1 > start && arr[end] == arr[end -1]){
                        right++;
                        end--;
                    }
                    ans +=left * right;
                    ans %=mod;
                    start++;
                    end--;
                }else{
                    ans +=(end - start + 1) * (end-start) /2;
                    ans %=mod;
                    break;
                }
            }
        }
        return (int)ans;
    }
}
