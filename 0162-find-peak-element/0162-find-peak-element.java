class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        int peakind = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
                peakind = i;
            }
        }
        return peakind;
    }
}