public class SecondYear implements Subject
{
    private final String subjectName;

    public SecondYear(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public String subjectName() {
        return subjectName;
    }

    public String assignSubject()
    {
        return "Assigning Second Year Subject";
    }
}
