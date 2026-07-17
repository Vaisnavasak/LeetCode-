import java.util.*;
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int b=nums1.length+nums2.length;
        int[] arr=new int[b];
        int mid=arr.length/2;
        int index = 0;

        
        for (int i = 0; i < nums1.length; i++) {
            arr[index] = nums1[i];
            index++;
        }

        
        for (int i = 0; i < nums2.length; i++) {
            arr[index] = nums2[i];
            index++;
        }
        Arrays.sort(arr);
        if(arr.length%2==0)
        {
          return (arr[mid] + arr[mid - 1]) / 2.0;

        }
        else
        {
            return arr[mid];
        }
        
    }
}