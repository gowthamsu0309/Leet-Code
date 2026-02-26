class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.charAt(0) == ch) return word;
        int right = 0;
        int left = 0;
        char [] a  = word.toCharArray();
        for(int i = 0;i < a.length;i++){
            if(a[i] == ch) {
                right = i;
                break;
            }
        }
        while(left < right){
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(a);
    }
}