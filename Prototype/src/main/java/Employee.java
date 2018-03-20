public class Employee implements Cloneable
{
    private String name;

    public Employee (String name)
    {
        this.name = name;
    }


    public Cloneable copy()
    {
        return new Employee(name);
    }

    public String getEmployee()
    {
        return this.name;
    }

}
