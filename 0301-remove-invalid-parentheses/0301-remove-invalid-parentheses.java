class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans =new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        HashSet<String> visit=new HashSet<>();
        
        q.offer(s);
        visit.add(s);
        boolean found=false;

        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-->0)
            {

            String cur=q.poll();

            if(isvalid(cur))
            {
                ans.add(cur);
                found=true;
            }
            if(found)
            {
                continue;
            }


            for(int i=0;i<cur.length();i++)
            {
                if(cur.charAt(i) !='(' && cur.charAt(i)!=')')
                {
                    continue;
                }

                String next=cur.substring(0,i)+cur.substring(i+1);

                if(!visit.contains(next))
                {
                    visit.add(next);
                    q.offer(next);
                }


            }
            }
            if(found)
            {
                break;
            }

        }
        return ans;


        
    }
    static boolean isvalid(String s)
    {
        int bal=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                bal++;
            }
            else if(ch==')'){
                bal--;
            }
            if(bal<0)
            {
                return false;
            }


        }
        return bal==0;
    }
}