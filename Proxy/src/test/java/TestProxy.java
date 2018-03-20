import org.junit.*;

import static org.junit.Assert.*;

public class TestProxy {

    Student stud;
    GetStudentData realStudent;
    GetStudentData studProxy;

    @Before
    public void setUp() throws Exception
    {
        stud = null;
        realStudent = null;
        studProxy = null;
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void Test() throws Exception
    {
        stud = new Student(78,63,62);
        stud.setName("Jacob");
        stud.setStudentNumber(212205587);
        studProxy = new StudentProxy(stud);

        assertEquals("Name: Jacob, Student Number: 212205587",studProxy.getStudentDetails());
    }

}