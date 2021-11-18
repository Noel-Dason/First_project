public class FindPeak {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,4,3,2,1};
        System.out.println(binary(num));
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
}
