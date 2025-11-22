public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int first = 0, second = 1, next = 0;
        int result = fibonacci(n,first, second, next);
        System.out.println(result);
    }

    private static int fibonacci(int n, int first, int second, int next) {
        for (int i = 0;  i<= n; i++){
            System.out.println(first+" ");
            next = first + second;
            first = second;
            second = next;
        }
        return n;
    }
}
