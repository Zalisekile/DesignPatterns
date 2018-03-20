public class CommerceStudent extends Student
{
    private final int studentNumber;
    private final String name;
    private final Subject subject;

    public CommerceStudent(Subject subject, int studentNumber, String name)
    {
        super(subject,studentNumber,name);
        this.studentNumber = studentNumber;
        this.subject = subject;
        this.name = name;
    }



    @Override
    public String registerStudent()
    {
        return ("Registering " + name + " for " + subject.subjectName());
    }

}
