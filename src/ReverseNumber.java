public class ReverseNumber {
    public static void main(String[] args) {
        int n = 15786;
        int result = reverseNumber(n);
        System.out.println(result);
    }

    private static int reverseNumber(int n) {
        int rev =0;
        while( n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n/10;
        }
        return rev;
    }
}
