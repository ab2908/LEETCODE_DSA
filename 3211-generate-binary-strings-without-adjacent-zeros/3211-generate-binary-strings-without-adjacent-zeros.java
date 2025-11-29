class Solution {
    public List<String> validStrings(int n) {
        List<String> res =new ArrayList<>();;
        generateString("",n,res,"2");
        return res;
    }
    public void  generateString(String s,int n,List<String>res,String prev){
        if(s.length()==n){
            res.add(s);
            return;
        }
        generateString(s+"1",n,res,"1");
        if(!prev.equals("0")){
            generateString(s+"0",n,res,"0");
        }
    }
}