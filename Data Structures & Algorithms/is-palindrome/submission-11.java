class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder nw = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                nw.append(Character.toLowerCase(c));
            }
        }

        String str = nw.toString();
        String rev = nw.reverse().toString();

        return str.equals(rev);
    }
}
