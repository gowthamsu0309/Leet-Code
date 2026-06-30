class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows){
            return s;
        }
        StringBuilder[] str = new StringBuilder[numRows];
        for(int i = 0;i < numRows;i++){
            str[i] = new StringBuilder();
        }
        int row = 0,step = 1;
        for(Character ch : s.toCharArray()){
            str[row].append(ch);

            if(row == 0){step = 1;}

            else if(row == numRows - 1){step = -1;}
            row += step;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder st : str){
            res.append(st);
        }
        return res.toString();
    }
}