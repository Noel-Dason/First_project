public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

//        int[] num = {12, 14,23,34,56,78,79,80,99};
        int[] num = {99, 80, 78, 45, 33, 29, 11, 3};
        int target = 78;
        int ans = binary_search(num, target);
        System.out.println(ans);
    }
    static int binary_search(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int avg = start + (end - start) / 2;
            if(arr[0]  < arr[arr.length -1]) {
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
            else{
                if (arr[avg] == target) {
                return avg;
            }
            if (target < arr[avg]){
                start = avg +1;
            }
            if( target > arr[avg]){
                end = avg - 1;
            }
            }
        }
        return -1;
    }
}
