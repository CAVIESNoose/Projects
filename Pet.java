public class Pet {

    //private data fields
    private String name;
    private String type;
    private int age;

    //public Constructor(s)
    public Pet()
    {
        this.setName("Pet Name");
        this.setType("Animal");
        this.setAge(1);
    }

    public Pet(String newName, String newType, int newAge)
    {
        this.setName(newName);
        this.setType(newType);
        this.setAge(newAge);
    }

    //public set or mutator method for every private data field
    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setType(String newType)
    {
        this.type = newType;
    }

    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    //public get or accessor method for every private data field
    public String getName()
    {
        return this.name;
    }

    public String getType()
    {
        return this.type;
    }

    public int getAge()
    {
        return this.age;
    }

    //public custom method that should return the sound the pet makes
    public String speak()
    {
        String sound;

        if (this.type.equalsIgnoreCase("Dog"))
        {
            sound = "Woof";
        }
        else if (this.type.equalsIgnoreCase("Cat"))
        {
            sound = "Meow";
        }
        else
        {
            sound = "Yowl";
        }

        return sound;
    }

    //public toString method that prints out all of the object state
    public String toString()
    {
        String output = "Pet information:\n";
        output += "Type: " + this.getType() + "\n";
        output += "Name: " + this.getName() + "\n";
        output += "Sound: " + this.speak() + "\n";
        output += "Age:  " + this.getAge();
        return output;
    }
}