import java.util.Random;

public class Dog implements Mammal
{

    public String move() {
        return "Moving on all fours";
    }

    public String giveBirth()
    {
        Random rand = new Random();
        int number = rand.nextInt(15) + 2;
        return "Your bitch has given birth to " +number+ " puppies";
    }

    public String breath()
    {
        return "Inhaling oxygen through the lungs";
    }
}
