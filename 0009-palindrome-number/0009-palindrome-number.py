class Solution:
    def isPalindrome(self, x: int) -> bool:
        s=str(x)
        lp=0
        rp=len(s)-1
        while (lp<=rp):
            if (s[lp]) == (s[rp]):
                lp+=1
                rp-=1 
            else:
                return False
        return True           