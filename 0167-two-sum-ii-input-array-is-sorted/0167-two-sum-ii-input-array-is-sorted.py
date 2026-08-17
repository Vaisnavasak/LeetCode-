class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lp = 0
        rp = len(nums)-1
        while(lp<rp):
            sum = nums[lp]+nums[rp]
            if(sum<target):
                lp+=1
            elif sum>target:
                rp-=1
            if(sum==target):
                return [lp+1,rp+1]
        return null
        