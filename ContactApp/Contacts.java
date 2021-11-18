package ContactApp;

import java.util.ArrayList;
import java.util.Scanner;

public class  Contacts {
    Scanner in = new Scanner(System.in);
    ArrayList<String> contactNames = new ArrayList<String>();
    ArrayList<Integer> contactNumbers = new ArrayList<Integer>();
    public void first(){
        contactNames.add("Noel");
        contactNames.add("Sam");
        contactNames.add("David");
        contactNumbers.add(123);
        contactNumbers.add(456);
        contactNumbers.add(789);
    }
    public void showContact(){
        System.out.println(contactNames.toString());
        System.out.println(contactNumbers.toString());
    }
    public void addContact(){
        System.out.println("First add 'Name' then add 'Number'");
        String newName = in.next();
        int newNumber = in.nextInt();
        contactNames.add(newName);
        contactNumbers.add(newNumber);
        System.out.println("The name " +newName +" and the number " + newNumber + " have been added " );
    }
    public void searchContact(){
        System.out.println("Enter the name you want to search");
        String searchName = in.next();
        if(contactNames.contains(searchName)){
            int index = contactNames.indexOf(searchName);
            System.out.println(contactNames.get(index));
            System.out.println(contactNumbers.get(index));
        }
        else{
            System.out.println("This contact does not exist");
        }
    }
    public void  deleteContact(){
        System.out.println("Enter the name of contact you want to delete");
        String deleteName = in.next();
        if(contactNames.contains(deleteName)){
            int index = contactNames.indexOf(deleteName);
            System.out.println(contactNames.remove(index));
            System.out.println(contactNumbers.remove(index));
        }
        else{
            System.out.println("This contact does not exist");
        }

    }

}
