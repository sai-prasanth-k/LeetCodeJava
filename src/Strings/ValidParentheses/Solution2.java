package Strings.ValidParentheses;

import java.util.Stack;

class Solution2 {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c =='['){
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                if(c ==')' && stack.peek() !='(') return false;
                if(c =='}' && stack.peek() !='{') return false;
                if(c ==']' && stack.peek() !='[') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
