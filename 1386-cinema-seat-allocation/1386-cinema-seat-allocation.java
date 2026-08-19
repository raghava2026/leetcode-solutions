class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {
            
      Map<Integer,Set<Integer>> map=new HashMap<>();
      for(int b[]:rs)
      {
        int row=b[0];
        int seat=b[1];
        if(seat>=2 && seat<=9)
        {
            map.computeIfAbsent(row,k->new HashSet<>()).add(seat);
        }
      }
        
        long count=2L*n;
        

       for(Set<Integer> set:map.values())
       {
          boolean l=true;
          boolean m=true;
          boolean right=true;

          for(int i=2;i<=5;i++)
          {
            if(set.contains(i))
            {
                l=false;
                break;
            }
          }
          for(int i=4;i<=7;i++)
          {
            if(set.contains(i))
            {
                m=false;
                break;
            }
          }
          for(int i=6;i<=9;i++)
          {
            if(set.contains(i))
            {
                right=false;
                break;
            }
          }

        if(l && right)
        {

        }
        else if(l||m||right)
        {
            count--;
        }
        else
        {
            count-=2;
        }

          
       }
        return (int)count;
    }
}