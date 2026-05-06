class Solution {
    private boolean ispal(String s){
            StringBuilder st = new StringBuilder(s);
            return s.equals(st.reverse().toString());
        }
    public boolean validPalindrome(String s) {
        if(ispal(s)) return true;
        for(int i=0;i<s.length();i++){
            String newS = s.substring(0, i) + s.substring(i + 1);
            if (ispal(newS)) {
                return true;
            }
        }
        return false;

    
}
}