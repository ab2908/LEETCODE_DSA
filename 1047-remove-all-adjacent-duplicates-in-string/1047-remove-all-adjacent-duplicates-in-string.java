class Solution{
    public String removeDuplicates(String S) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++) {       
            if(!st.isEmpty()&&st.peek()==S.charAt(i)){
                st.pop();
            } 
            else{
                st.push(S.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}