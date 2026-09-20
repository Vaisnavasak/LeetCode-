class Solution:
    def findPeakElement(self, nums: list[int]) -> int:
        peakind = 0
        max = float(-inf)
        for i in range(0, len(nums)):
            if (nums[i]>max):
                max = nums[i]
                peakint = i
        return peakint
        