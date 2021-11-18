import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    max(a,b,c);
    min(a,b,c);
    }
    static void max(int a, int b , int c) {
        if (a > b && a > c) {
            System.out.println("Maximum is "+ a);
        }
        else if(b>a && b>c){
            System.out.println("Maximum is "+ b);
        }
        else{
            System.out.println("Maximum is " + c);
        }
    }
    static void min(int a, int b , int c) {
        if (a < b && a < c) {
            System.out.println("Minimum is "+ a);
        }
         else if(b<a && b<c){
            System.out.println("Minimum is "+ b);
        }
        else{
            System.out.println("Minimum is " + c);
        }
    }

}
