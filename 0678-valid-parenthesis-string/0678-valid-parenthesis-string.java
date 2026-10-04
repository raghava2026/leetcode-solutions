class Solution {
    public boolean checkValidString(String s) {
      
      int min=0;
      int max=0;
      
        for(char i: s.toCharArray())
        {

            if(i=='(')
            {
                min++;
                max++;

            }
            else if(i==')')
            {
                min--;
                max--;
            }
            else
            {
                min--;
                max++;

            }
            if(max<0)
            {
                return false;
            }
            else if(min<0)
            {
                min=0;
            }

            
        }
        return min==0;
        
    }
}