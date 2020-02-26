class IDGenerator {

    private static String id = "000";


    /**
     * Generates a continuous 3-digit ID
     * @return unique 3 digit ID
     */
    static String generateID(){
        int counter = Integer.parseInt(id);
        counter++;
        id = String.format ("%03d", counter);
        return id;
    }

}
