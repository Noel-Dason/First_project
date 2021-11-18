public class ElementInAInfiniteArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,34,45,56,78,90};
        System.out.println(ans(num,12));
    }
    static int ans(int [] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
           int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        int ans = binarySearch(arr, target, start, end );
        return ans;
    }

    static int binarySearch(int[] arr,int target, int start, int end ){

       while (start <= end){
           int avg = (end - start)/2 + start;
           if (target> arr[avg]){
               start = avg +1;
           }
           else if(target < arr[avg]){
               end = avg - 1;
           }
           else{
               return avg;
           }
       }
       return -1;
    }
}
