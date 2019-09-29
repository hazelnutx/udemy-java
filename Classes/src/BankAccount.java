package Classes.src;

public class BankAccount {
    public static void main(String[] args) {
        BankSettings user = new BankSettings();
        BankSettingsConstructor userConstructor = new BankSettingsConstructor();
        BankSettingsConstructor raul = new BankSettingsConstructor("email@email.com", 074132);

        System.out.println(userConstructor.getName());
        System.out.println(raul.getEmail());

        user.deposit();
        System.out.println("The balance is: " + user.getBalance());

        user.withdraw();

        user.setEmail("gigi@yahoo.com");
        System.out.println("Email is : " + user.getEmail());

        user.setName("Raul");
        System.out.println("Name is : " + user.getName());
    }
}