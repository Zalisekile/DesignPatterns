import org.junit.*;

import static org.junit.Assert.*;

public class TestBridgePattern
{
    Subject subject;
    Subject subject2;
    Student student;
    @Before
    public void setUp() throws Exception
    {
        subject = null;
        subject2 = null;
        student = null;
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void Test() throws Exception
    {
        subject = new SecondYear("Technical Programming 1");
        subject2 = new ThirdYear("Technical Programming 2");
        student = new ITStudent(subject,212205587,"James");

       assertEquals("Registering James for Technical Programming 1",student.registerStudent());
        student.registerStudent();

       assertEquals("Name: James, Student Number: 212205587, Subject: Technical Programming 1",student.printStudent());

       assertEquals("Registering James for Technical Programming 1",student.registerStudent());

       System.out.println(subject.assignSubject());

    }

}