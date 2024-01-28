class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.trim();
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int length = s.length();
        for(int i=0; i<length/2; i++){
            if(s.charAt(i) !=s.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}