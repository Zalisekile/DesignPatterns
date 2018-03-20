import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee employee1;
    Employee employee2;

    @Before
    public void setUp() throws Exception
    {
        employee1 = null;
        employee2 = null;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception
    {
        employee1 = new Employee("Jacob");
        employee2 = (Employee) employee1.copy();

        //Checking if the Value retruned by the get employee getMethod is the same for employee1 and its copy
        assertEquals(employee2.getEmployee(),employee1.getEmployee());

        //Checking if the locations in memory are actually different
        assertNotEquals(System.identityHashCode(System.identityHashCode(employee1)),System.identityHashCode(System.identityHashCode(employee1)));

        //printing employee 1 memory location
        System.out.println("Employee1:" + System.identityHashCode(System.identityHashCode(employee1)));

        //printing employee2 memory location
        System.out.println("Employee2:" + System.identityHashCode(System.identityHashCode(employee2)));
    }

}