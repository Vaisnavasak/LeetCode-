class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        i = 1
        while (i<=num/i):
            if (i*i==num):
                return True
            i+=1
        return False
        