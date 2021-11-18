public class FindInMountainArray {
//    For better solution view Kunal's solution
    public static void main(String[] args) {
        int[] num = {1,2,3,4,6,5,3,0};
        System.out.println(search(num,3 ));
    }
    static int binary(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(true){
            int avg = (end - start)/2 + start;
            if(arr[avg+1] > arr[avg]){
                start = avg + 1;
            }
            else if(arr[avg + 1] < arr[avg]){
                end = avg;
            }
            if(start == end){
                return start;
            }
        }
    }
    static int search (int[] arr, int target){
        int max = binary(arr);
        if (target < arr[max]) {
            int start = 0;
            int end = max -1;
            while (start <= end){
                int avg = start + (end - start)/2;
                if(target > arr[avg]){
                    start = avg +1;
                }
                else if(target < arr[avg]){
                    end = avg -1;
                }
                else {
                    return avg;
                }
            }
        }
        else if(target == arr[max]) {
            return max;
        }

            int start = max + 1;
            int end = arr.length - 1;
            while (start <= end){
                int avg = start + (end - start)/2;
                if(target > arr[avg]){
                    end = avg -1;
                }
                else if(target < arr[avg]){
                    start = avg +1;
                }
                else {
                    return avg;
                }
            }
        return -1;
    }
}
