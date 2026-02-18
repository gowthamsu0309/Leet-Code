class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            long totalWeight = 0;
            for (char c : word.toCharArray()) {
                totalWeight += weights[c - 'a'];
            }
            int remainder = (int) (totalWeight % 26);
            char mappedChar = (char) ('z' - remainder);
            result.append(mappedChar);
        }
        
        return result.toString();

        
    }
}