import java.util.Scanner;

public class Tests {

    //private data fields
    private double ave;
    private int count;
    private int score;

    //public Constructor
    public Tests()
    {
    }

    //public get or accessor method for every private data field
    public double getAve()
    {
        return this.ave;
    }

    public int getCount()
    {
        return this.count;
    }

    public int getScore()
    {
        return this.score;
    }

    //public set or mutator method for score (ave and count are read-only, no set method)
    public void setScore(int newScore)
    {
        this.score = newScore;
    }

        //custom method that reads scores from the user and calculates the average
    public void getAverage()
    {
        Scanner scnr = new Scanner(System.in);
        int sum = 0;
        int localCount = 0;

        //prompt and prime the loop
        System.out.println("Enter a test score (or -1 to quit):");
        int input = scnr.nextInt();

        //loop until user enters -1
        while (input != -1)
        {
            this.setScore(input);
            sum += this.getScore();
            localCount++;
            System.out.println("Enter a test score (or -1 to quit):");
            input = scnr.nextInt();
        }

        //calculate the average
        this.count = localCount;
        this.ave = (double) sum / this.count;
    }

        //public toString method that prints out the object state
    public String toString()
    {
        String output = "The average of the " + this.getCount() + " scores entered is " + String.format("%.2f", this.getAve()) + ".";
        return output;
    }
}