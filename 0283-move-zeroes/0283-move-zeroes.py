class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        index = 0
        for i in range (0,len(nums)):
            if nums[i]!=0:
                temp = nums[index];
                nums[index]=nums[i]
                nums[i]=temp
                index+=1
        