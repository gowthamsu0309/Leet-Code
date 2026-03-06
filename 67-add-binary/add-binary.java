class Solution {
    public String addBinary(String a, String b) {
        StringBuilder bd = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        long carry = 0;

        while(i >=0 || j >=0 || carry != 0){
            long sum = carry;
            if(i >=0) sum+= a.charAt(i--) - '0';
            if(j >=0) sum+=b.charAt(j--) - '0';
            bd.append(sum % 2);
            carry = sum / 2;
        }
        return bd.reverse().toString();
    }
}