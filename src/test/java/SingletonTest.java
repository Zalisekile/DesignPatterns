import static org.junit.Assert.*;

public class SingletonTest {


    //Creating Singleton account
    Singleton account;
    //Creating Singleton account
    Singleton account1;

    @org.junit.Before
    public void setUp() throws Exception
    {
        //Initializing the accounts with null
        account = null;
        account1 = null;

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }



    @org.junit.Test
    public void test() throws Exception
    {
        //Initializing the account number with an instance of account
        account = account.getInstance();
        account.setAccount(212205587);

        //Initializing account with an Instance of account1.getInstance
        account1 = account1.getInstance();

        //Despite the fact that the account Number was only set in account, account1.getAccount1() still returns the same account number
        //Which means its only returning the same instance, actually kinda cool
        assert(account1.getAccount() == account.getAccount());
    }


}