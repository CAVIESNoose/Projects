public class Pet {

    //private data fields
    private String name;

    //public Constructor(s)
    public Pet()
    {
        this.setName("Pet Name");
    }

    //public set or mutator method for every private data field
    public void setName(String newName)
    {
        this.name = newName;
    }

    //public get or accessor method for every private data field
    public String getName()
    {
        return this.name;
    }

    //public toString method that prints out all of the object state
    public String toString()
    {
        String output = "Pet information:\n";
        output += "Name: " + this.getName();
        return output;
    }

    //main
    public static void main(String[] args)
    {
        //instantiate Pet
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        Pet pet2 = new Pet();
        pet2.setName("Buster");
        System.out.println(pet2.toString());
    }
}