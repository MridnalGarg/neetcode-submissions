class Solution {
    public char getOpeningBracket(char x){
        switch(x){
            case '}' : return '{';
            case ']' : return '[';
            case ')' : return '(';
            default : return ' ';
        }
    }
    public boolean isValid(String s) {
        String openingBrackets = "{[(";

        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray()){
            if(openingBrackets.contains(String.valueOf(x))){
                stack.push(x);
                continue;
            } 
            
            if(
                stack.isEmpty()
                || stack.pop() != getOpeningBracket(x)
            ){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
