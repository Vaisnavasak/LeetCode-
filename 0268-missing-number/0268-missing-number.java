class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int miss = 0;

        for(int i = 0;i<=nums[nums.length-1];i++)
        {
            if(nums[i]!=i)
            {
                miss = i;
                break;
            }
            miss = nums.length;
        }
        return miss;
    }
}