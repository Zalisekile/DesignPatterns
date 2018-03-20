public class ThirdYear implements Subject
{
    private final String subjectName;

    public ThirdYear(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public String subjectName() {
        return subjectName;
    }

    public String assignSubject()
    {
        return "Assigning Third Year Subject";
    }
}
