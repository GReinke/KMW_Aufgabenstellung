

class Client {


    private String first_name;
    private String last_name;
    private String account_ID;
    private double balance;
    private boolean dispo;

    /**
     *
     * @param first_name First name of the client.
     * @param last_name last name of the client.
     * @param dispo true = dispo credit granted | false = dispo credit was denied
     */
    Client(String first_name, String last_name, boolean dispo) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.dispo = dispo;
        this.balance = 100;
        this.account_ID = IDGenerator.generateID();
    }

    String getFirst_name() {
        return first_name;
    }

    String getLast_name() {
        return last_name;
    }

    String getAccount_ID() {
        return account_ID;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    boolean hasDispo() {
        return dispo;
    }
}
