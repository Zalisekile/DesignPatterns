public abstract class Student
{

    private final int studentNumber;
    private final Subject subject;
    private final String name;

    public Student(Subject subject, int studentNumber, String name)
    {
        this.studentNumber = studentNumber;
        this.subject = subject;
        this.name = name;
    }

    public abstract String registerStudent();

    public String printStudent()
    {
        return ("Name: " + name+ ", Student Number: " +studentNumber + ", Subject: " +subject.subjectName());
    }
}
