public class SearchInRoatedSortedArray {
    public static void main(String[] args) {
    int[] num = {4,5,6,0,1,2,3};
        System.out.println(ans(num,6));
    }
    static int max(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int avg = (end - start)/2 + start;
            if(avg<end && arr[avg] > arr[avg + 1]){
                return avg;
            }
            else if(avg>start && arr[avg] < arr[avg-1]){
                return avg -1;
            }
            else if(arr[start] >= arr[avg]){
                end = avg-1;
            }
            else if(arr[start] <= arr[avg]) {
                start = avg +1;
            }
        }
        return -1;
//        (My solution as pivot will always be max)
//        int max = 0;
//        int indexMax = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//                indexMax = i;
//            }
//        }
//        return indexMax;
    }
    static int binary_search(int[] arr,int target,int start, int end) {
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
    static int ans(int[] arr, int target){
        int max = max(arr);
        int ans1 = binary_search(arr, target, 0,max-1);
        int ans2 =   binary_search(arr, target, max +1,arr.length-1);
        if(ans1 != -1){
            return ans1;
        }
        else if(target == arr[max]){
            return max;
        }
        return ans2;
    }
}
