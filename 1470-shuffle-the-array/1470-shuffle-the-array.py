class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        list=[]
        k=0
        for i in range(0,n):
            list.append(nums[i])
            list.append(nums[n+i])
            k+=2
        return list
        