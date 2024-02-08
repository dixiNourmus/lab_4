public class three {
    public static void main(String[] args) {
        int startBal = 5000;
        double tax = 1.17;
        double month1 = startBal * tax;
        double month2 = month1 * tax;

        System.out.println("your total after month 1 is " + month1);
        System.out.println("your total after month 2 is " + month2);


    }


}
