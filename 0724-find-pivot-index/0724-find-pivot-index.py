class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        ls = 0;
        rs = 0;
        for i in range(0,len(nums)):
            rs+=nums[i]
        for i in range(0,len(nums)):
            rs-=nums[i]
            if (rs==ls):
                return i
            ls+=nums[i]
        return -1