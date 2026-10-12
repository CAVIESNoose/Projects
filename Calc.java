import java.util.Scanner;

public class Calc {

    //private data fields
    private double num1;
    private double num2;

    //default constructor
    public Calc()
    {
    }

    //set or mutator method for num1
    public void setNum1(double newNum1)
    {
        this.num1 = newNum1;
    }

    //set or mutator method for num2
    public void setNum2(double newNum2)
    {
        this.num2 = newNum2;
    }

    //asks for num1 over and over until the user enters a number
    public void setNum1()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        //keep asking while the input is not a number
        while (!scan.hasNextDouble())
        {
            scan.nextLine(); //throw away the bad input
            System.out.println("Invalid input. Please enter a number.");
            System.out.print("Enter first number: ");
        }

        //valid number, so store it using the set method
        this.setNum1(scan.nextDouble());
    }

    //asks for num2 over and over until the user enters a number
    public void setNum2()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter second number: ");

        //keep asking while the input is not a number
        while (!scan.hasNextDouble())
        {
            scan.nextLine(); //throw away the bad input
            System.out.println("Invalid input. Please enter a number.");
            System.out.print("Enter second number: ");
        }

        //valid number, so store it using the set method
        this.setNum2(scan.nextDouble());
    }

    //get or accessor method for num1
    public double getNum1()
    {
        return this.num1;
    }

    //get or accessor method for num2
    public double getNum2()
    {
        return this.num2;
    }

    //returns the sum of num1 and num2
    public double add()
    {
        return this.num1 + this.num2;
    }

    //returns the difference of num1 and num2
    public double subtract()
    {
        return this.num1 - this.num2;
    }

    //returns the product of num1 and num2
    public double multiply()
    {
        return this.num1 * this.num2;
    }

    //returns the quotient of num1 and num2
    public double divide()
    {
        return this.num1 / this.num2;
    }

    //toString method that displays the object state
    public String toString()
    {
        String output = "Displaying private data fields using toString():\n";
        output += "Num1: " + this.getNum1() + "\n";
        output += "Num2: " + this.getNum2();
        return output;
    }
}