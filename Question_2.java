import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
//        Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display
//        grades according to the marks entered as below: Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        String result = GR(marks);
        System.out.println(result);

    }
    static String GR(int marks){
       String Grade = "" ;
      if(marks> 91 && marks <=100){
          Grade = "AA";
      }
      else  if(marks> 81 && marks <=90){
          Grade = "AB";
        }
      else  if(marks> 71 && marks <=80){
          Grade = "BB";
        }
      else  if(marks> 61 && marks <=70){
          Grade = "BC";
        }
      else if(marks> 51 && marks <=60){
          Grade = "CD";
        }
      else if(marks> 41 && marks <=50){
          Grade = "DD";
        }
      else if (marks < 41 && marks >=0){
          Grade = "Fail";
      }
      else {
          Grade = "Enter valid marks";
      }
        return Grade;
    }
}
