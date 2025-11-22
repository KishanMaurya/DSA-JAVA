public class Prime {
    public static void main(String[] args) {
        int num = 6;
        boolean result = isPrime(num);
        System.out.println(result);
    }

    private static boolean isPrime(int num) {
        for (int i= 2; i <num/2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return false;
    }
}
