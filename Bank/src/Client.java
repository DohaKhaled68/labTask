/**
 * This is the Client class which will be holding client data
 * @author : Doha Khaled
 *
 *
 *
 */
public class Client {
    protected String name;
    protected String nationalID;
    protected String address;
    protected String phone;
    protected Account account;

    public Client(String name, String nationalID, String address, String phone, Account account) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }

    Client()
    {

        String name = " ";
         String nationalID = " ";
         String address =" ";
         String phone = " ";
         Account account = new Account();
    }

    /**
     *
     * @return
     */
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return
                ("name: " + name) +
                        ("\nnationalID: " + nationalID) +
                        ("\naddress: " + address) +
                        ("\nphone: " + phone) +
                        ("\naccount: \n" + account.toString());
    }
}
