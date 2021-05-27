import java.util.ArrayList;
public class Bank {
    protected String name;
    protected String address;
    protected String phone;

    private ArrayList<Account> AccountArrayList  = new ArrayList<Account>();
    private ArrayList<Client> ClientArrayList  = new ArrayList<Client>();
    Bank()
    {

        this.name = " ";
        this.address =" ";
        this.phone = " ";

    }
    public Bank(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    public void AddCLient(Client client) {
        ClientArrayList.add(client);
        AccountArrayList.add(client.getAccount());
    }


    public void printClients() {
        for(int i=0; i<ClientArrayList.size(); i++)
        {
            System.out.println( ClientArrayList.get(i)/*"name: " + ClientArrayList.get(i).name +
                    "\nnationalID: " + ClientArrayList.get(i).nationalID +
                    "\naddress: " + ClientArrayList.get(i).address +
                    "\nphone: " + ClientArrayList.get(i).phone +
                    "\naccount: \n" + ClientArrayList.get(i).account*/);
        }

    }




}