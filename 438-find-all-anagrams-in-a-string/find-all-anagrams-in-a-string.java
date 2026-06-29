class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] pfreq = new int[26];
        int[] sfreq = new int[26];

        for(char ch : p.toCharArray()){
            pfreq[ch - 'a']++;
        }
        int window = p.length();

        for(int i = 0;i < s.length();i++){
            sfreq[s.charAt(i) - 'a']++;

            if(i >= window){
                sfreq[s.charAt(i - window) - 'a']--;
            }
            if(Arrays.equals(pfreq,sfreq)){
                res.add(i - window + 1);
            }
        }
        return res;
    }
}