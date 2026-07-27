class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        int[] arr = new int[2];
        int n=0;

        for (int i=0;i<nums.length;i++)
        {
            int count = 0;
            for(int j=0; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                {
                    count +=1;
                }
            }
            if (count == 1)
            {
        arr[n]=nums[i];
        n++;        
            }
        }
      
        return arr;
    }
}