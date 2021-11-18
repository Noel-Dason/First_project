import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int []  rnos = new int[5];
       Scanner in = new Scanner(System.in);
//        for (int i = 0; i < rnos.length; i++) {
//            rnos[i] = in.nextInt();
//        }
//        for (int i = 0; i < rnos.length; i++) {
//            System.out.print(rnos[i] + " " );
//        }
        String [] name = new String[3];
        for (int i = 0; i < name.length ; i++) {
            name[i] = in.next();
        }
        System.out.println(Arrays.toString(name));
    }
}
