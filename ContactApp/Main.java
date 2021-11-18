package ContactApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacts c1 = new Contacts();
        c1.first();
        Messages m1 = new Messages();
        m1.first();
        while(true) {
            System.out.println("Welcome user");
            System.out.println("1.Manage Contacts");
            System.out.println("2.Message");
            System.out.println("3.Quit");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            if (number == 1) {
                while (true) {
                    System.out.println("1.Show all contacts");
                    System.out.println("2.Add a new contact");
                    System.out.println("3.Search for a contact");
                    System.out.println("4.Delete contact");
                    System.out.println("5.Go back to previous menu");
                    int number1 = in.nextInt();
                    if (number1 == 1) {
                        c1.showContact();
                    }
                    if (number1 == 2) {
                        c1.addContact();
                    }
                    if (number1 == 3) {
                        c1.searchContact();
                    }
                    if (number1 == 4) {
                        c1.deleteContact();
                    }
                    if (number1 == 5) {
                        break;
                    }

                }

            }
            if (number == 2) {
                while (true) {
                    System.out.println("1. See the list of all messages");
                    System.out.println("2. Send a new message");
                    System.out.println("3. Go back to previous menu");
                    int number2 = in.nextInt();
                    if (number2 == 1) {
                        m1.messageList();
                    }
                    if (number2 == 2) {
                        m1.sendMessage();
                    }
                    if (number2 == 3) {
                        break;
                    }
                }
            }
            if (number == 3) {
                break;
            }
        }
    }
}
