class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        index = 0
        for i in range(0,len(nums)):
            if nums[i]%2==0:
                temp = nums[index]
                nums[index]=nums[i]
                nums[i]=temp
                index+=1
        return nums
        