
import java.util.Scanner;

class Console {


    private static Scanner input =  new Scanner(System.in);

    /**
     * Shows main menu displaying initial options to proceed
     */
    static void mainMenu(){
        System.out.println(
                "Hello and welcome to the KMW Banking Solution. ]\n" +
                        "The following commands are available:\n" +
                        "add - opens a new bank account for a client.\n" +
                        "list - shows a list of all clients by ID.\n" +
                        "show - shows account infomation of a client.\n" +
                        "transfer - options for transferring money between accounts."
        );
        switch(input.nextLine()){
            case "add":
                System.out.println("ADD");
                addClient();
                break;
            case "list":
                System.out.println("LIST");
                ClientList.showList();
                proceed();
                break;
            case "show":
                System.out.println("SHOW");
                showClient();
                proceed();
                break;
            case "transfer":
                System.out.println("TRANSFER");
                doTransaction();
                break;
            default:
                faultyInput();
        }

    }

    /**
     * A set of instructions to direct the user towards putting in essential data for client creation.
     */
    private static void addClient(){
        String first_name;
        String last_name;
        boolean dispo;
        System.out.println(
                "Please enter the first Name of the Client."
        );
        first_name = input.nextLine();
        System.out.println(
                "Please enter the last Name of the Client."
        );
        last_name = input.nextLine();
        System.out.println(
                "Please specify whether the Client is eligible for dispo credit.\n" +
                "Please type in YES or NO."
        );

        if (input.nextLine().equalsIgnoreCase("YES")){
            dispo = true;
            System.out.println("The client does get a dispo credit.");
        }else{
            dispo = false;
            System.out.println("The client does not get a dispo credit. \n");
        }
        ClientList.addClient(new Client(first_name, last_name, dispo));
        proceed();

    }

    /**
     * A set of instructions to direct the user towards putting in an ID in order to show corresponding client data
     */
    private static void showClient(){

        System.out.println(
                "Please enter the account ID of the Client."
        );
        ClientList.showClient(input.nextLine());
    }

    /**
     * A set of instructions to direct the user towards putting in essential data for transactions
     */
    private static void doTransaction(){
        String sender;
        String recipient;
        double amount;

        System.out.println(
                "Please enter the account ID of the sender."
        );
        sender = input.nextLine();

        System.out.println(
                "Please enter the account ID of the recipient."
        );
        recipient = input.nextLine();
        System.out.println(
                "Please enter the amount that should be transferred(#.##)"
        );
        try{
            amount = Double.parseDouble(input.nextLine());
            Transactions.transaction(sender, recipient, amount);
            proceed();
        }catch(NumberFormatException e){
            faultyInput();
        }
    }

    /**
     * Used to direct the user back towards the main menu, after a task was completed
     */
    private static void proceed(){
        System.out.println("Type \"continue\" to return to the main menu.");
        if (input.nextLine().equals("continue")){
            mainMenu();
        }else{
            faultyInput();
        }
    }

    /**
     * Used to automatically return the user to the main menu, if any inputs were faulty.
     */
    private static void faultyInput(){
        System.out.println("Your input was faulty. You will be returned to the main menu");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            //ignore
        }
        mainMenu();
    }
}
