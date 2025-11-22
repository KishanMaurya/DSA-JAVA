public class ZeroSubArray {
        int[] arr = {1,3,0,0,2,0,0,4};
        int result = zeroFilledSubarrays(arr);
        private int zeroFilledSubarrays(int[] arr) {
            int count = 0;
            int n= 0;
            for (int i =0;  i< arr.length; i++){
                if(n == 0) n++;
                else {
                    count+=n*(n+1)/2;
                }
            }

            return count + n * (n + 1) / 2;
        }

}
