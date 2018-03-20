import org.junit.*;

import static org.junit.Assert.*;

public class AbstractFactoryTest {
    EmployeeFactory adminStaffFactory;
    Employee receptionist;

    EmployeeFactory academicStaffFactory;
    Employee lecturer;

    @Before
    public void setUp() throws Exception
    {
        adminStaffFactory = null;
        receptionist = null;

        adminStaffFactory = null;
        lecturer = null;
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void test() throws Exception
    {
        adminStaffFactory = FactoryProducer.getEmployeeFactory("Admin Staff");
        receptionist = adminStaffFactory.returnPosition("Receptionist");
        String expected = "This individual is a receptionist, they handle business";
        assert(expected.equals(receptionist.printPosition()));

        academicStaffFactory = FactoryProducer.getEmployeeFactory("Academic Staff");
        lecturer = academicStaffFactory.returnPosition("lecturer");
        assertEquals("This individual is a lecturer, Respect",lecturer.printPosition());


    }



}