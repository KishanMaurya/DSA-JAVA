import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {3,2,4};
        int target = 6;

        int[] result = twoSum(num, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] num, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0;  i< num.length; i++){
            int c = target - num[i];
            if(hashMap.containsKey(c)){
                return new int[]{hashMap.get(c), i};
            }
            hashMap.put(num[i],i);
        }
        return new int[]{-1,-1};
    }
}
