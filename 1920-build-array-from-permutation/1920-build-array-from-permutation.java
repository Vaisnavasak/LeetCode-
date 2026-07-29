class Solution {
    public int[] buildArray(int[] nums) {
        int[] l = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
            l[i]=nums[nums[i]];
        }
        return l;
    }
}