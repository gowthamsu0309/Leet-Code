class Solution {
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;
        str = str.trim();
        
        if (str.isEmpty()) return 0;
        int sign = 1, i = 0;
        long result = 0;
        if (str.charAt(0) == '-') { sign =-1; i++; }
        
        else if (str.charAt(0) == '+') i++;
        
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            result = result * 10 + (str.charAt(i) - '0');
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            i++;
        }
        return (int)(result * sign);
    }
}