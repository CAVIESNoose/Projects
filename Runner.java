import java.util.Scanner;

public class Runner {

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        //instantiate first Pet using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        //instantiate second Pet using custom constructor
        Pet pet2 = new Pet("Buster", "Dog", 11);
        System.out.println(pet2.toString());

        //instantiate third Pet using user input
        System.out.println("Enter animal type:");
        String userType = scnr.next();

        System.out.println("Enter animal name:");
        String userName = scnr.next();

        System.out.println("Enter animal age:");
        int userAge = scnr.nextInt();

        Pet pet3 = new Pet(userName, userType, userAge);
        System.out.println(pet3.toString());
    }
}