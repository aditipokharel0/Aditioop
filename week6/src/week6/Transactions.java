package week6;

public class Transactions {
    public static void main(String[] args) {
        // Creating accounts with different constructors
        Account account1 = new Account("aditi pokharel", "9830088276");
        Account account2 = new Account("Jane Smith", "789012", 1000.0);

        // Displaying account information
        System.out.println("Account 1 Information:");
        account1.display();
        System.out.println();

        System.out.println("Account 2 Information:");
        account2.display();
        System.out.println();
    }
}
