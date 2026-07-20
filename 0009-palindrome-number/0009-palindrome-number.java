import java.util.*;
class Solution 
{
    public boolean isPalindrome(int x)
    {
        String s = String.valueOf(x);
        int lp = 0;
        int rp =s.length()-1;
        while(lp<=rp)
        {
            if(s.charAt(lp)==s.charAt(rp))
            {
                lp=lp+1;
                rp=rp-1;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}