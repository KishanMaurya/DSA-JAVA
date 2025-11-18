/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]*/

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k  = 3;
        int[] result = rotateAarray(arr,k);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rotateAarray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        //full array reverse
        reverses(arr, 0, n-1);
        // reverse first k elements
        reverses(arr, 0, k-1);
        //reverse last n-k elements
        reverses(arr, k, n-1);
        return arr;
    }

    private static void reverses(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
