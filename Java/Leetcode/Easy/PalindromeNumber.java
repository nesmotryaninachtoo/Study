//Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        return str.contentEquals(sb.reverse());
    }
}
