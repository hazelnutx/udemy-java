package Classes.src;

public class BankSettings {

    private int accNumber;
    private int balance;
    private String name;
    private String email;
    private int phone;

    // Account number
    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccNumber() {
        return this.accNumber;
    }

    // Balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    // Customer Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Customer Email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    // Customer phone
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return this.phone;
    }
}