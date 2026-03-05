class Solution {
    public int minOperations(String s) {
        int n1 = 0;
        int n2 = 0;
        for(int i = 0;i < s.length();i++){
            char exp1 = (i % 2 == 0) ? '0' : '1';
            char exp2 = (i % 2 == 0) ? '1' : '0';

            if(s.charAt(i) != exp1) n1++;
            if(s.charAt(i) != exp2) n2++;
        }
        return Math.min(n1, n2);
    }
}