import java.util.Arrays;

public class FirstandLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
//        searchRange(nums, 8);
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
       int start = ans[0]= search(arr, target , true);
       int end = ans[1] =  search (arr, target, false);
        return ans;
    }

    static int search(int[] arr, int target, boolean findStart) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int avg = start + (end - start) / 2;
            if (target < arr[avg]) {
                end = avg - 1;
            }
            else if (target > arr[avg]) {
                start = avg + 1;
            } else {
                 ans = avg;
                if(findStart){
                    end = avg -1;
                }
                else {
                    start = avg + 1;
                }
            }
        }
        return ans;
    }
}