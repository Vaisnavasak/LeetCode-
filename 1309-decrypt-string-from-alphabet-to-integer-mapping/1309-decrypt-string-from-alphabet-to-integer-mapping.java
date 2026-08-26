class Solution 
{
    public String freqAlphabets(String s) 
    {
        StringBuilder str = new StringBuilder();
      for(int i=s.length()-1;i>=0;i--)
      {
        int num;
        char ch = s.charAt(i);
        if(ch=='#')
        {
            num = Integer.parseInt(s.substring(i-2,i));
            i-=2;
        }
        else
        {
            num = Integer.parseInt(String.valueOf(ch));
        }
        char c = (char)('a'+num-1);
        str.append(c);
      }
      return str.reverse().toString();  
    }
}