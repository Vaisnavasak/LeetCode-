class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        l=[]
        for i in range (0,len(nums)):
            l.append(nums[nums[i]])
        return l        