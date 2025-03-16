package com.vatsal.JavaPrograms.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * Returns the indices of the two numbers in the given array such that they add up to the given target.
     * @param nums the given array of numbers
     * @param target the target sum
     * @return the indices of the two numbers in the array that sum up to the target, or null if no such numbers exist
     */
    public int[] two_sum(int[] nums,int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
    }
    return null;
    }

    /**
     * Returns the indices of the two numbers in the given array such that they add up to the given target.
     * This implementation uses a HashMap to achieve O(n) time complexity.
     *
     * @param nums the given array of numbers
     * @param target the target sum
     * @return the indices of the two numbers in the array that sum up to the target, or null if no such numbers exist
     */
    public int[] two_sum_Simplified(int[] nums,int target)  {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}

