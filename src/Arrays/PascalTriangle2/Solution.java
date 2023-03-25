package Arrays.PascalTriangle2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex){
        List<Integer> output = new ArrayList<>();

        for(int i = 0 ; i <= rowIndex;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    temp.add(1);
                }else {
                    temp.add(output.get(j-1) + output.get(j));
                }
            }
            output = temp;
        }
        return output;
    }

}
