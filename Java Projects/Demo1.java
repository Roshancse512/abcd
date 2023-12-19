import java.util.Scanner;
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target!=nums[i]+nums[i+1])
            {
                 nums[i]=nums[i+1];
            }
        }
        return nums;
        
    }
}
class Demo1
{
    public static void main(String args[])
    {
        Solution s=new Solution();
        Scanner s1=new Scanner(System.in);
        int size=s1.nextInt();
        for(int i=0;i<size;i++)
        {
            int nums=s1.nextInt();
        }
        System.out.println("target");
        int t=
        s.twoSum(nums, t);
        
    }
}