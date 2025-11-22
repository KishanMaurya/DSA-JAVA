import java.util.Arrays;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int result = missingNumber(arr);
        System.out.println(result);
    }

    private static int missingNumber(int[] arr) {
        int n = arr.length;
        int[] newArray = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(newArray ));

        int num = 1;
        for (int i  = 0; i< n; i++){

            System.out.println("NuAA-> "+newArray[i]+ "+"+ num);
            if (newArray[i] == num){
                return num;
            }
            System.out.println("Num-> "+num);
            num++;
        }
        return -1;
    }
}
