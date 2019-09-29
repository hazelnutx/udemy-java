package Classes.src;

import java.util.Scanner;

public class BankSettingsConstructor {
    Scanner scanner = new Scanner(System.in);

    private int accNumber;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public BankSettingsConstructor() {
        this(213, 0.00, "Default name", "Default email", 0740); // Calling another constructor with it's parameters.
        System.out.println("Empty Constructor");
    }

    public BankSettingsConstructor(int accNumber, double balance, String name, String email, int phone) {
        /*
         * We do all our initialization here and the other consturctors should just call
         * this one for the paramaters. Or better the other constructor should just call
         * this MAjor (main) one.
         */
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public BankSettingsConstructor(String email, int phone) {
        this(100, 10.23, "Marius", email, phone);
        /*
         * This calls the Big constructor in which you put new paramaters and you call
         * the params from the new constructor
         */
    }

    // Account number
    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccNumber() {
        return accNumber;
    }

    // Balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // Customer Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Customer Email
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Customer phone
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public double deposit() {
        System.out.println("Enter your deposit number: ");
        boolean isInt = scanner.hasNextDouble();
        if (isInt) {
            double deposit = scanner.nextDouble();
            if (deposit <= 0) {
                System.out.println("You cannot deposit less or equal to 0 amount");
            } else {
                this.balance += deposit;
            }
        } else {
            System.out.println("INVALID");
        }
        return this.balance;
    }

    public double withdraw() {
        if (this.balance <= 0) {
            System.out.println("Cannot withdraw");
        } else {
            System.out.println("Enter the withdraw amount: ");
            boolean isInt = scanner.hasNextDouble();
            if (isInt) {
                double withdraw = scanner.nextDouble();
                this.balance -= withdraw;
                System.out.println("The new balance after withdraw is: " + getBalance());
            } else {
                System.out.println("INVALID");
            }
        }
        scanner.close();
        return this.balance;
    }
}