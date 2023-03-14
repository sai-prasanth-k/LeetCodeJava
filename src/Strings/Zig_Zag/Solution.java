package Strings.Zig_Zag;

class Solution {
    public String convert(String s, int numRows) {
        //Define StringBuilder for given rows
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i< numRows;i++){
            sb[i] = new StringBuilder();
        }
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        //Traverse in Loop to get zig-zag
        while(i<n){
            //Traverse Downwards
            for(int j = 0; j < numRows && i< n; j++){
                sb[j].append(arr[i++]);
            }
            //Traverse Upwards
            for(int j = numRows-2;j >0 && i<n;j--){
                sb[j].append(arr[i++]);
            }
        }
        //Combine StringBuilder into one
        StringBuilder res = sb[0];
        for(int k = 1; k<numRows;k++){
            res.append(sb[k].toString());
        }
        return res.toString();
    }
}
