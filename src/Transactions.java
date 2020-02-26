
import java.util.Objects;

class Transactions {

    /**
     * @param idOut account ID of the sender
     * @param idIn account ID of the recipient
     * @param amount amount of money to be transferred
     */
    static void transaction(String idOut, String idIn, double amount){
        Client clientOut = ClientList.getClient(idOut);
        Client clientIn = ClientList.getClient(idIn);
        if(clientIn == null || clientOut == null){
            System.out.println("One of the clients does not exist. Please refer to the client list.");
        }else{
            if(clientOut.getBalance() >= amount || clientOut.hasDispo()){
                clientOut.setBalance(clientOut.getBalance() - amount);
                clientIn.setBalance(clientIn.getBalance() + amount);
                System.out.println("The transaction was successful.");
            }else{
                System.out.println("The sender does not have enough money in his bank account.");
            }
        }
    }
}
