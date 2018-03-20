public class Student implements GetStudentData
{

    private int DOS;
    private int TP2;
    private int IP3;

    private String name;
    private int studentNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Student(int DOS, int TP2, int IP3)
    {
        this.DOS = DOS;
        this.TP2 = TP2;
        this.IP3 = IP3;
    }

    public Student()
    {}

    public int getDOS() {
        return DOS;
    }

    public void setDOS(int DOS) {
        this.DOS = DOS;
    }

    public int getTP2() {
        return TP2;
    }

    public void setTP2(int TP2) {
        this.TP2 = TP2;
    }

    public int getIP3() {
        return IP3;
    }

    public void setIP3(int IP3) {
        this.IP3 = IP3;
    }

    public String getStudentDetails()
    {
     return "Name: " +  this.name + ", Student Number: " + this.studentNumber;
    }

    public String getStudentResults()
    {
        return "DOS: " + this.DOS + "\nIP3: " + this.IP3 +"\nTPG: " + this.IP3;
    }
}
