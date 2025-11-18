/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/


import java.lang.reflect.Array;
import java.util.Arrays;

public class productExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result  = productsExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] productsExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 1;
        for (int i = 0;  i < n; i++){
            result[i] = left;
            left*=arr[i];
        }
        int right = 1;
        for (int i = n - 1; i>=0; i--){
            result[i] *= right;
            right*=arr[i];
        }
        return result;
    }
}
