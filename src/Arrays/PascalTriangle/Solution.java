package Arrays.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> current = new ArrayList<>();

        for(int i =0; i< numRows; i++){
            current.add(0,1);
            for( int x =1; x< current.size()-1;x++){
                current.set(x,current.get(x) + current.get(x+1));
            }
            output.add(new ArrayList<>(current));
        }
        return output;
    }
}
