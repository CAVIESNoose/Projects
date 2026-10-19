import java.util.Arrays;
import java.util.Random;

public class IntArray {

    //private data fields
    private int length;
    private int myArray[];

    //constructor that allocates an array with l elements
    public IntArray(int l)
    {
        this.length = l;
        this.myArray = new int[l];
    }

    //deletes the values and all of the elements
    public void clear()
    {
        this.length = 0;
        this.myArray = new int[0];
    }

    //fills every element with a random integer from 1 to 6
    public void fillRand()
    {
        Random rand = new Random();
        for (int i = 0; i < this.length; i++)
        {
            this.myArray[i] = rand.nextInt(6) + 1;
        }
    }

    //returns the value at the given position
    public int get(int element)
    {
        return this.myArray[element];
    }

    //sets the value at the given position
    public void set(int element, int newValue)
    {
        this.myArray[element] = newValue;
    }

    //returns the number of array elements
    public int size()
    {
        return this.length;
    }

    //returns true if the array has no elements
    public boolean isEmpty()
    {
        return this.length == 0;
    }

    //sorts the array from lowest to highest
    public void sort()
    {
        Arrays.sort(this.myArray);
    }

    //toString method that shows all of the array data
    public String toString()
    {
        String output = "";
        for (int i = 0; i < this.length; i++)
        {
            output += this.myArray[i] + " ";
        }
        return output;
    }
}