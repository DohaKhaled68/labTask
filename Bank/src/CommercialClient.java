public class CommercialClient extends Client {
    private String comercialID;

    public CommercialClient(String name, String address, String phone, Account account, String comercialID) {
        super(name, "000000000", address, phone, account);
        this.comercialID = comercialID;
    }

    @Override
    public String toString() {
        return ("name: " + name) +
                ("\nComercial ID: " + comercialID) +
                ("\naddress: " + address) +
                ("\nphone: " + phone) +
                ("\naccount: \n" + account.toString());
    }
}
