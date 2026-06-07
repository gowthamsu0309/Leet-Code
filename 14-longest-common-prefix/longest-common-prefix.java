class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int p1 = 0;
        int p2 = 0;
        while(p1 < first.length() && p2 < last.length()){
            if(first.charAt(p1) == last.charAt(p2)){
                p1++;
                p2++;
            }
            else{
                break;
            }
        }
        return first.substring(0,p1);
    }
}