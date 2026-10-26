import java.util.ArrayList;

public class Asn5 {

    public static void main(String[] args)
    {
        //first ArrayList holds Strings
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grape");

        //second ArrayList holds Integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        //display both lists using an enhanced for loop
        System.out.println("Fruits before changes:");
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }

        System.out.println("Numbers before changes:");
        for (Integer number : numbers)
        {
            System.out.println(number);
        }

        //operation 1: remove an item from the String list
        fruits.remove("Banana");

        //operation 2: change the value at index 0 in the Integer list
        numbers.set(0, 99);

        //display both lists again because the data changed
        System.out.println("Fruits after removing Banana:");
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }

        System.out.println("Numbers after setting index 0 to 99:");
        for (Integer number : numbers)
        {
            System.out.println(number);
        }
    }
}