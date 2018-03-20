public class AcademicStaffFactory implements EmployeeFactory
{
    public Employee returnPosition(String jobid) {

        if("Lecturer".equalsIgnoreCase(jobid) )
        {
            return new Lecturer();
        }

        if("HOD".equalsIgnoreCase(jobid) )
        {
            return new Hod();
        }

        if("Dean".equalsIgnoreCase(jobid) )
        {
            return new Dean();
        }

        if("Professor".equalsIgnoreCase(jobid) )
        {
            return new Professor();
        }

        return null;
    }
}
