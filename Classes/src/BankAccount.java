package Classes.src;

public class BankAccount {
    public static void main(String[] args) {
        BankSettings user = new BankSettings();

        user.deposit();
        System.out.println("The balance is: " + user.getBalance());

        user.withdraw();

        user.setEmail("gigi@yahoo.com");
        System.out.println("Email is : " + user.getEmail());

        user.setName("Raul");
        System.out.println("Name is : " + user.getName());
    }
}