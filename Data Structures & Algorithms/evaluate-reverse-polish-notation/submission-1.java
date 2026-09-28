class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String str : tokens) {
            if (
                str.equals("+") 
                || str.equals("-") 
                || str.equals("*") 
                || str.equals("/")
                ) {
                int b = stack.pop();
                int a = stack.pop();
                
                switch (str) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } else {
                stack.push(Integer.parseInt(str));
            }
        }

        return stack.pop();
    }
}
