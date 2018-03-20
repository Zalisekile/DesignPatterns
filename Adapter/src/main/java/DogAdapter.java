public class DogAdapter implements Mammal
{
    private Octopus theOctopus;

    public DogAdapter (Octopus newOctopus)
    {
        theOctopus = newOctopus;
    }

    public String move() {
       return theOctopus.swim();
    }

    public String giveBirth()
    {
      return  theOctopus.layEggs();
    }

    public String breath() {
       return theOctopus.respirate();
    }
}
