public class Exam extends Assessment {

    //private data fields
    private int numQuestions;  //number of questions on the exam
    private int numMissed;     //number of questions missed
    private double pointsEach; //points each question is worth

    //constructor that sets the exam data and calculates the score
    public Exam(int questions, int missed)
    {
        this.numQuestions = questions;
        this.numMissed = missed;

        //each question is worth an equal share of 100 points
        this.pointsEach = 100.0 / questions;

        //score is 100 minus the points lost for missed questions
        double numericScore = 100.0 - (missed * this.pointsEach);

        //store the score using the inherited set method
        this.setScore((int) numericScore);
    }

    //returns the points each question is worth
    public double getPointsEach()
    {
        return this.pointsEach;
    }

    //returns the number of questions missed
    public int getNumMissed()
    {
        return this.numMissed;
    }
}