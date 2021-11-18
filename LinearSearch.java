import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 23, 43, 22, 56, 19, 10, 11, 39};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = linear(arr, target);
        System.out.println(ans);
    }
    static int linear(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (target == element) {
                return element;
            }

        }
        return -1;
    }
}
