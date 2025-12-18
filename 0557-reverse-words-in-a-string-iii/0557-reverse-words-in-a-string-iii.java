class Solution {
    public String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c!= ' ') {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append(' ');
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        } 
        return result.toString();
    }
}