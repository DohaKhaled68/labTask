/**
 *  This is Problem 1's Account class that will handle the user's balance
 *  and account ID which will be generated automatically
 *  @author Doha Khaled
 */
public class Account {
    protected Double balance;
    static private Integer accountNumber = 1000;
    private Integer accNum;

    /**
     * Constructor that creates an account and sets initial balance to 0
     * and sets a special account number to the object
     */
    Account()
    {
        this.balance=0.0;
        this.accNum = accountNumber;
        accountNumber ++;
    }

    /**
     * @param b
     * Parametarized Constructor that creates an account and sets initial balance to b
     * and sets a special account number to the object
     */
    Account(Double b)
    {
        this.balance = b;
        this.accNum = accountNumber;
        accountNumber ++;
    }

    /**
     * Sets balance to b
     * @param b
     */
   public void setBalance (Double b)
    {
        this.balance = b;
    }

    /**
     * balance getter
     * @return
     */
    public Double getBalance ()
    {
        return this.balance;
    }

    /**
     * @return
     */
    public Integer getAccNumber() {
        return accNum;
    }

    /**
     * @param amount
     * @throws Exception
     */
    public void deposit (Double amount) throws Exception
    {
        if(amount <= 0)
        {
            throw new Exception("You can't add less than Zero");
        }
        this.balance+= amount;

    }

    /**
     * @param ammount
     * @throws Exception
     */
    public void withdraw (Double ammount) throws Exception
    {
        if(ammount > this.balance)
        {
            throw new Exception("You don't have enough balance");
        }
        if(ammount<=0)
        {
            throw new Exception("You can't withdraw that amount");
        }
        this.balance-= ammount;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return String.format("Account Number: " + this.accNum + '\n' + "Balance: " + this.balance);
    }
}
