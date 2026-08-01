class Solution 
{
    public int maxArea(int[] arr) 
    {
        int left = 0;
        int right = arr.length-1;
        int maxarea = 0;
        int area;
        while(left<right)
        {
            if(arr[left]<=arr[right])
            {
                area = arr[left]*(right-left);
                left++;
            }
            else
            {
                area = arr[right]*(right-left);
                right--;
            }
            maxarea = Math.max(area, maxarea);
        }
        return maxarea;
    }
}