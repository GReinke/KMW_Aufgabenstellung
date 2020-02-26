public class Main {

    public static void main(String[] args) {


        //TESTFÄLLE
/**
        ClientList.addClient(new Client("Max", "Mustermann", true));
        ClientList.addClient(new Client("Lisa", "Musterfrau", false));

        System.out.println("Before emptying Max' account \n" +
                "Max: " + ClientList.getClient("001").getBalance() +"\n" +
                "Lisa: " + ClientList.getClient("002").getBalance());

        ClientList.getClient("001").setBalance(0);

        System.out.println("After emptying Max' account\n" +
                "Max: " + ClientList.getClient("001").getBalance() +"\n" +
                "Lisa: " + ClientList.getClient("002").getBalance());

        Transactions.transaction("001", "002", 100);

        System.out.println("After transferring 100€ from Max to Lisa\n" +
                "Max: " + ClientList.getClient("001").getBalance() +"\n" +
                "Lisa: " + ClientList.getClient("002").getBalance());

        Transactions.transaction("002", "001", 200.01);

        System.out.println("After transferring 200.01€ from Lisa to Max\n" +
                "Max: " + ClientList.getClient("001").getBalance() +"\n" +
                "Lisa: " + ClientList.getClient("002").getBalance());
**/

    Console.mainMenu();
    }





}
