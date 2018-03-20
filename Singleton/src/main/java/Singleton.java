public class Singleton
{

    private int accountNumber;
    private String Name;
    private String Surname;


    private static Singleton account = null;
    private Singleton(){}
    public static Singleton getInstance()
    {
        if (account == null)
        {
            account = new Singleton();
        }
        return account;
    }

    public void setAccount(int AccountNumber)
    {
        this.accountNumber = 212205587;
    }

    public int getAccount()
    {
        return this.accountNumber;
    }
}
