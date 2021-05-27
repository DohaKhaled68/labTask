public class SpecialAccount extends Account {
    public SpecialAccount() {
    }

    public SpecialAccount(Double b) {
        super(b);
    }

    @Override
    public void withdraw (Double ammount) throws Exception
    {
        Double amount = balance-ammount;
        if(ammount<= 0)
        {
            throw new Exception("You can't withdraw that amount");
        }
        if(amount < -1000.0)
        {
            throw new Exception("You don't have enough balance "+ amount);
        }

        this.balance= ammount;
    }

}
