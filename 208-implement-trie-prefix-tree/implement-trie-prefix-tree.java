class Trie {
    int i;
    Map<Integer,String> mp = new HashMap<>();

    public Trie() {
        Map<Integer,String> mp = new HashMap<>();
        int i = 0;
    }
    
    public void insert(String word) {
        mp.put(i,word);  
        i++;
    }
    
    public boolean search(String word) {
        for(String s : mp.values()){
            if(s.equals(word)){
                return true;
            }
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        for(String s : mp.values()){
            StringBuilder sb = new StringBuilder(s);
                if(sb.indexOf(prefix) == 0){
                    return true;
                }
            }
            return false;
        }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */