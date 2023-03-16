package Strings.GenerateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n){
        List<String> output = new ArrayList<>();
        int open = 0;
        int close = 0;
        String current_string = "";
        backTrack(output,current_string,open,close,n);
        return output;
    }

    private void backTrack(List<String> output, String current_string, int open, int close, int n) {
        if(current_string.length() == n*2){
            output.add(current_string);
            return;
        }
        if(open<n) backTrack(output,current_string + "(" , open +1,close,n);
        if(close<open) backTrack(output,current_string + ")" , open ,close + 1,n);
    }
}
