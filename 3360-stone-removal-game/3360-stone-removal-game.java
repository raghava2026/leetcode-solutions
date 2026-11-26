class Solution {
    public boolean canAliceWin(int n) {
        int currentTurn = 10; 
        int count=0;
        while (n > 0) {
            if (currentTurn > n) {
                break;
            }
            n -= currentTurn;
            currentTurn--;
            count+=1;
        }
        if(count%2!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}