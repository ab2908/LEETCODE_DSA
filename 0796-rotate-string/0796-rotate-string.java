class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()){
            return false;
        }
        String cat= s+s;
        return cat.contains(goal);
    }
}