public class SmallestLetter {
    public static void main(String[] args) {
        char[] letter = {'a','c','f','j','w'};
        System.out.println(binary(letter, 'z'));
    }
    static char binary(char[] arr,char target){
        int start = 0;
        int end = arr.length - 1;
        while (start<= end){
            int avg = start + (end - start)/2;
            if(target >= arr[avg]){
                start = avg +1;
            }
            if(target  < arr[avg] ){
                end = avg - 1;
            }
        }
//        if(target > arr[arr.length-1]){ My logic (also correct)
//            return arr[0];
//        }
        return arr[start % arr.length];
    }
}
