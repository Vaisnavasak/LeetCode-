class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        list=[0]*len(nums)
        k=0
        for i in range(0,n):
            list[k]=nums[i]
            list[k+1]=nums[i+n]
            k+=2
        return list
        