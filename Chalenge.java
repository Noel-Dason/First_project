import java.util.Scanner;

public class Chalenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any no. to begin");
        int num = -1;
        int sum =0;
        while(num != 0){
            num = in.nextInt();
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
