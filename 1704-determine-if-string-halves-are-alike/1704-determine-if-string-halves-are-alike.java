class Solution
{
    public boolean halvesAreAlike(String s) 
    {
        int no1 = 0;
        int no2 = 0;
        int mid = s.length()/2;
        for(int i=0;i<mid;i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || 
    ch == 'o' || ch == 'u' ||
    ch == 'A' || ch == 'E' || ch == 'I' || 
    ch == 'O' || ch == 'U')
            {
                no1+=1;
            }
        }
        for(int j=s.length()/2;j<s.length();j++)
        {
            char ch = s.charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'i' || 
    ch == 'o' || ch == 'u' ||
    ch == 'A' || ch == 'E' || ch == 'I' || 
    ch == 'O' || ch == 'U')
            {
                no2+=1;
            }
        } 
        if (no1 == no2)
        {
            return true;
        }     
        return false;
    }
}