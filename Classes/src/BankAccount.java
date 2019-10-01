package Classes.src;

public class BankAccount {
    public static void main(String[] args) {
        BankSettings user = new BankSettings();
////        BankSettingsConstructor userConstructor = new BankSettingsConstructor();
////        BankSettingsConstructor raul = new BankSettingsConstructor("email@email.com",
////        074132);
//
//        System.out.println(userConstructor.getName());
//        System.out.println(raul.getEmail());

        user.deposit();
        System.out.println("The balance is: " + user.getBalance());

        user.withdraw();

        user.setEmail("gigi@yahoo.com");
        System.out.println("Email is : " + user.getEmail());

        user.setName("Raul");
        System.out.println("Name is : " + user.getName());

        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("marcela", 50, "marc@email.com");
        VipCustomer vip3 = new VipCustomer(10, "marius@email.com");

        System.out.println(vip1.getName());
        System.out.println(vip2.getCreditLimit());
        System.out.println(vip3.getName());
    }
}