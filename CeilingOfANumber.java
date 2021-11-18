public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] num = {2,3,5,9,14,16,18};
        System.out.println(binary(num, 20));
    }
    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[arr.length-1]){
            return -1;
        }
        while (start<= end){
            int avg = start + (end - start)/2;
            if(arr[avg] == target){
                return arr[avg];
            }
            if(target > arr[avg]){
                start = avg +1;
            }
            if(target  < arr[avg] ){
                end = avg - 1;
            }
        }
//        return ceiling(arr, target);
        return arr[start];
    }
//    My logic(also correct)
//    static int ceiling(int[] arr, int target){
//        int ans = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] > target){
//                ans = arr[i];
//                break;
//            }
//        }
//        return ans;
//    }
}
