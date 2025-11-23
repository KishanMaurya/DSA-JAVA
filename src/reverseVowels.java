static class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        String vowels = "aeiouAEIOU";

        while (left < right) {

            // Move left pointer until a vowel is found
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }

            // Move right pointer until a vowel is found
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }

            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}


void main(String[] args) {
    Solution obj = new Solution();
    String result  = obj.reverseVowels("Unglad, I tar a tidal gnu.");
    System.out.println(result);
}
