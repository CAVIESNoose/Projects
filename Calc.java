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