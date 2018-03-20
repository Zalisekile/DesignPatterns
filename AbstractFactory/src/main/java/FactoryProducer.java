public class FactoryProducer
{
    public static EmployeeFactory getEmployeeFactory(String factoryType)
    {
        if("Admin Staff".equalsIgnoreCase(factoryType) )
        {
            return new AdminStaffFactory();
        }

        if("Academic Staff".equalsIgnoreCase(factoryType) )
        {
            return new AcademicStaffFactory();
        }

        return null;
    }
}
