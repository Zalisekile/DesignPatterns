public class AdminStaffFactory implements EmployeeFactory
{
    public Employee returnPosition(String jobid)
    {
        if("Clerk".equalsIgnoreCase(jobid) )
        {
            return new Clerk();
        }

        if("Receptionist".equalsIgnoreCase(jobid) )
        {
            return new Receptionist();
        }

        if("Help Desk Operator".equalsIgnoreCase(jobid) )
        {
            return new HelpDeskOperator();
        }

        return null;
    }
}
