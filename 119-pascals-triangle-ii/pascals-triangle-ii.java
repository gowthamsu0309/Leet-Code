class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls = new ArrayList<>();
        int row = rowIndex+1;
        long c = 1;
        for(int i = 1;i <= rowIndex+1;i++){
            ls.add((int)c);
            c = c * (row - i) / i;
        }
       return ls; 
    }
}