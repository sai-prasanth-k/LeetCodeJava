package ValidParentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                if (c == ')' && !stack.isEmpty() && stack.peek() == '(') return false;
                if (c == '}' && !stack.isEmpty() && stack.peek() == '{') return false;
                if (c == ']' && !stack.isEmpty() && stack.peek() == '[') return false;
                stack.pop();
            }
        }

        return stack.isEmpty();

    }
}
