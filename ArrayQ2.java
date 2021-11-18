public class ArrayQ2 {
    public static void main(String[] args) {
        int[] arr = {1, 32, 33 , 45 ,21 };
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maximum = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if( arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
}
