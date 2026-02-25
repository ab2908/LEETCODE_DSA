class Solution {
    public String decodeString(String s){
      int n= s.length();
      Stack<Character> st=new Stack<>();
      for(int i=0;i<n;i++){
        if(s.charAt(i)!=']'){
            st.push(s.charAt(i));
        }
        else{
            StringBuilder decodeTemp= new StringBuilder();
            while (!st.isEmpty() && st.peek()!='[') {
                    decodeTemp.append(st.pop());
            }
            decodeTemp.reverse();
            st.pop();
            int tempno=0;
            int base=1;
            while(!st.isEmpty() && Character.isDigit(st.peek())){
                tempno=(st.pop()-'0')*base+tempno;
                base=base*10;
            }

            while(tempno>0){
                for(char c: decodeTemp.toString().toCharArray()){
                          st.push(c);
                }
                tempno--;

            }
        }
      }
        StringBuilder result=new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.reverse().toString();
     
    }
}
