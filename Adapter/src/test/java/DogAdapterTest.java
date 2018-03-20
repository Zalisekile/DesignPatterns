import org.junit.*;

import static org.junit.Assert.*;

public class DogAdapterTest {
    Dog dog;
    private Octopus octopus;
    DogAdapter octo;

    @Before
    public void setUp() throws Exception
    {
         dog = null;
         octopus = null;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception
    {
        octopus = new Octopus();
        dog = new Dog();
        octo = new DogAdapter(octopus);




        assertNotEquals(octo.breath(),dog.breath());
        assertNotEquals(octo.move(),dog.move());
        assertNotEquals(octo.giveBirth(),dog.giveBirth());

    }

}