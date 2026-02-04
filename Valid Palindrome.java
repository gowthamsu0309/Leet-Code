class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase();
        StringBuilder sb = new StringBuilder(st);
        for(int i = 0;i < sb.length();i++){
            if(!Character.isLetterOrDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
                i--;
            }
        }
        int i = 0;
        int j = sb.length() -1;
        while(i < j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
