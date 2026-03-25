class Solution {
    public int maxRepeating(String seq, String word) {
       int count = 0;
       String curr = word;
       while(seq.contains(curr)){
        count++;
        curr += word;
       }
       return count; 
    }
}