class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length-1;
        while(lp<rp)
        {
            int res=nums[rp]+nums[lp];
            if(res<target)
            {
                lp+=1;
            }
            else if(res>target)
            {
                rp-=1;
            }
            if(res==target)
            {
                return new int[]{lp+1,rp+1};
            }
        }
        return new int[]{};
    }
}