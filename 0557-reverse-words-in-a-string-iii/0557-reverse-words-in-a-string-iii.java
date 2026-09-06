class Solution {
    public String reverseWords(String s) {
        String []a=s.split("\\s+");
        String ss="";
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=swap(a[i]);
            ss=ss+a[i]+" ";
            
        }
        ss+=swap(a[a.length-1]);
        return ss;
        
    }
    static String swap(String s)
    {
        int l=0;
        int r=s.length()-1;
        StringBuffer sc=new StringBuffer(s);
        while(l<r)
        {
            char at=sc.charAt(l);
            sc.setCharAt(l,sc.charAt(r));
            sc.setCharAt(r,at);
            l++;
            r--;


        }
        return sc.toString();


    }
}