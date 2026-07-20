import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String a;
        String b;
        String rev="";
        if(x>=0)
        {
            a=String.valueOf(x);
            for(int i=a.length()-1;i>=0;i--)
            {
                rev=rev+a.charAt(i);

            }
        }
        else
        {
            x=x*(-1);
            a=String.valueOf(x);
            a="-"+a;
            for(int i=a.length()-1;i>=0;i--)
            {
                rev="-"+rev+a.charAt(i);

            }
        }
        
        if(a.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}