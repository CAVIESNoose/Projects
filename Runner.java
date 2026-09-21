public class Runner {

    public static void main(String[] args)
    {
        //instantiate Tests object
        Tests tests = new Tests();

        //call the custom method to collect scores and calculate average
        tests.getAverage();

        //display the result
        System.out.println(tests.toString());
    }
}