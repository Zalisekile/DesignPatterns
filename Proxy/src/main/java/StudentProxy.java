public class StudentProxy implements GetStudentData {

    Student stud = new Student();

    public StudentProxy()
    {

    }

    public StudentProxy(Student stud)
    {
        this.stud = stud;
    }

    public String getStudentResults() {


        return stud.getStudentResults();
    }

    public String getStudentDetails()
    {
        Student realStudent = new Student();

        return stud.getStudentDetails();
    }
}
