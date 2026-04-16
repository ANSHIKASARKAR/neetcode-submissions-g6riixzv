class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str= new StringBuilder();
        for( char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }

        String s1= str.toString();
        String rev= str.reverse().toString();
        return s1.equals(rev);
    }
}
