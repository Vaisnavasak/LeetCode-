class Solution(object):
    def findKthPositive(self, arr, k):
        mis = []
        for i in range(1,arr[-1]+k+1):
            if i not in arr:
                mis.append(i)
            if len(mis) == k:
                break
        return mis[-1]