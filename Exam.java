public class Exam extends Assessment
{
    // Number of questions on the exam
    private int numQuestions;

    // Number of questions missed
    private int numMissed;

    // Points each question is worth
    private double pointsEach;

    // Constructor
    public Exam(int questions, int missed)
    {
        // Stop a division by zero
        if (questions == 0)
        {
            throw new ArithmeticException("The exam must have at least 1 question.");
        }

        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / questions;

        // Work out the score and send it to the parent class
        double numericScore = 100.0 - (missed * this.pointsEach);
        this.setScore((int) numericScore);
    }

    // Returns the points each question is worth
    public double getPointsEach()
    {
        return this.pointsEach;
    }

    // Returns the number of questions missed
    public int getNumMissed()
    {
        return this.numMissed;
    }
}