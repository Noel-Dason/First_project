import java.util.Arrays;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] candies = {1,2,3,2,3};
        System.out.println(maximum(candies,1));
    }
    static int max(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static String maximum(int[] arr, int extra_candies){
        boolean[] values = new boolean[arr.length];
        int max_candies = 0;
        for (int i = 0; i < arr.length; i++) {
            max_candies = arr[i] + extra_candies;
            values[i] = max_candies > max(arr);
        }
         return Arrays.toString(values);
    }
}
