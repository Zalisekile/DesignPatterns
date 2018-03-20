import java.util.Random;

public class Octopus
{
    public String swim()
    {
        return "Swimming in the ocean";
    }

    public String layEggs()
    {
        Random rand = new Random();
        int random = rand.nextInt(100000) + 20000;
        return ("The Octopus has laid " + random + " Eggs");
    }

    public String respirate()
    {
        return "respirating through the gills";
    }

}
