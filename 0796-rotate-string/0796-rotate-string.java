class Solution {
    public boolean rotateString(String s, String target) {

        if (s.length() != target.length()) {
            return false;
        }

        return (s + s).contains(target);
    }
}