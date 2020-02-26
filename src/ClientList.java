import java.text.DecimalFormat;
import java.util.Objects;

class ClientList {


    //list is limited to 100 due to time constraints.
    private static Client[] list = new Client[100];
    private static DecimalFormat cash = new DecimalFormat("#.##");


    /**
     * Adds an object of the type "Client" to the array. Can produce OutOfBoundsException if too many clients are being added.
     * @param client which will be added to the list.
     */
    static void addClient(Client client) {
        for (int i = 0; list.length > i; i++) {
            if (list[i] == null) {
                list[i] = client;
                break;
            }
        }
    }

    /**
     * Shows all clients by displaying their account ID's in the console.
     */
    static void showList(){
        for (Client client : list) {
            if (client != null) {
                System.out.println(client.getAccount_ID());
            } else {
                break;
            }
        }
    }

    /**
     * Displays client Information in the console such as first name, last name, account ID, account balance
     * and whether the client was granted a dispo credit.
     * @param id account ID of the client.
     */
    static void showClient(String id){
        if(getClient(id)!=null) {
            System.out.println(
                            "First name: " + getClient(id).getFirst_name() + "\n" +
                            "Last name: " + getClient(id).getLast_name() + "\n" +
                            "Account ID: " + getClient(id).getAccount_ID() + "\n" +
                            "Balance: " + cash.format(getClient(id).getBalance()) + "€" + "\n" +
                            "Dispo credit: " + (getClient(id).hasDispo() ? "YES" : "NO")
            );
        }else{System.out.println("The client does not exist. Please refer to the client list.");}

    }

    /**
     *
     * @param id account ID of the client.
     * @return returns the "Client" - object corresponding to the account ID.
     */
    static Client getClient(String id) {
        for (Client client : list) {
            if (client != null && client.getAccount_ID().equals(id)) {
                return client;
            }
        }
        return null;
    }
}
