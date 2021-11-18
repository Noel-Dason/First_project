import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to our game, please enter your name");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Welcome " + name);
        System.out.println("Type 'yes' if you are ready or else type 'no'");
        String ans = in.next();
        if(ans.equals("yes")){
            System.out.println("A random number has been generated try to guess that number ");
            double random = Math.random()*100;
            int random1 = (int) random;
            int i = 0;
            while(i < 5){
                int userInput = in.nextInt();
                if(userInput == random1){
                    System.out.println("You guessed the correct number, Congratulations!");
                    break;
                }
                else if(userInput > random1){
                    System.out.println("The target number is lower than the entered number");
                }
                else if(userInput < random1){
                    System.out.println("The target number is greater than the entered number");
                }
                i++;
            }
            if(i == 5){System.out.println("You have lost the game");}
        }
        else if(ans.equals("no")){
            System.out.println("Thank you for joining us!");
        }

    }
}
