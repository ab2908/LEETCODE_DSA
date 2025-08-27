class Solution {
    public boolean isValid(String s) {
        Stack <Character> st= new Stack<>();
        int count=0;
        for(char x:s.toCharArray()){
            if(x=='{'||x=='['||x=='('){
                st.push(x);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char t=st.pop();
                if(x=='}'&& t!='{'||
                    x==']'&& t!='['||
                    x==')'&& t!='('){
                        return false;
                }
            }
        }
        return st.isEmpty();
    }
}