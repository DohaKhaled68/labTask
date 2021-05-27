public class Main {

    public static void main(String[] args) {
        Account dohaAcc = new Account(10000000.0);
        SpecialAccount mohamedACC = new SpecialAccount(1000.0);
        System.out.println(dohaAcc.getAccNumber());
        System.out.println(dohaAcc.toString());
        dohaAcc.setBalance(20000000.0);
        System.out.println(dohaAcc.toString());
        try {
            mohamedACC.withdraw(2500.0);
            dohaAcc.deposit(100.0);
            System.out.println(dohaAcc.toString());
            dohaAcc.withdraw(1000.0);
            System.out.println(dohaAcc.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        Client doha = new Client("Doha", "02000", "Shoubra street", "012024" ,dohaAcc );
       System.out.println(doha.toString());
        CommercialClient mohamed = new CommercialClient("Mohamed", "Ain shams", "011024", mohamedACC, "Comm ID");


        Bank bank = new Bank("FCI Bank", "5 Ahmed Zewail", "35555");

        bank.AddCLient(doha);
        bank.AddCLient(mohamed);
        System.out.println("--------------------");
       bank.printClients();


    }
}
