public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {12, 14,23,34,56,78,79,80,99};
        int target = 12;
        int ans = binary_search(num, target);
        System.out.println(ans);
    }
    static int binary_search(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int avg = start + (end - start) / 2;
            if (arr[avg] == target) {
                 return avg;
            }
            if (target > arr[avg]){
                start = avg +1;
            }
            if( target < arr[avg]){
                end = avg - 1;
            }
        }
        return -1;
    }
}
