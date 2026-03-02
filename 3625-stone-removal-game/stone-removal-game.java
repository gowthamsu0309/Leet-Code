class Solution {
    public boolean canAliceWin(int n) {
        int flag = 0;
        int tn = 10;
        while(n > 0){
            if(n >= tn){
                n = n - tn;
                tn--;
                flag++;
            }
            else{
                break;
            }
        }
        if(flag % 2 == 0){
            return false;
        }
        return true;
    }
}