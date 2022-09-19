public class Main {
    public static void main(String[] args) {
        double creditBalance = 5000;
        double interest1 = creditBalance*1.17;
        double interest2 = creditBalance*1.17*1.17;

        System.out.println("The credit balance after 1 month is $"
        + interest1 + " and afer 2 months is $" + interest2);
    }
}