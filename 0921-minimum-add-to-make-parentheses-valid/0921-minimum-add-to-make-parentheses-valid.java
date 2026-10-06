class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();

        for(char i: s.toCharArray())
        {
            if( st.isEmpty()||i=='(')
            {
               st.push(i); 

            }
            else if(st.peek()=='(' && i==')')
            {
                st.pop();
            }
            else
            {
                st.push(i);
            }
        }
        return st.size();
        
    }
}