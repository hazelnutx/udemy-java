package Classes.src;

import java.util.Scanner;

public class BankSettings {
    Scanner scanner = new Scanner(System.in);

    private int accNumber;
    private double balance;
    private String name;
    private String email;
    private int phone;

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