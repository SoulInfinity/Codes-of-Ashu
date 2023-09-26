package Experiment8;
class Bank {
     double balance;
     Bank(double balance) {
        this.balance = balance;
    }
     void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

     void withdraw(double amount) {
        System.out.println("Withdrawal not supported by the base class.");
    }
}

class SBI extends Bank {
     SBI(double balance) {
        super(balance);
    }
     void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("SBI: Withdrawn: " + amount);
        } else {
            System.out.println("SBI: Insufficient balance");
        }
    }
}
class ICICI extends Bank {
    public ICICI(double balance) {
        super(balance);
    }
    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("ICICI: Withdrawn: " + amount);
        } else {
            System.out.println("ICICI: Insufficient balance");
        }
    }
}

class AXIS extends Bank {
     AXIS(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("AXIS: Withdrawn: " + amount);
        } else {
            System.out.println("AXIS: Insufficient balance");
        }
    }
}

public class Q3
{
public static void main(String[] args) 
   {
        Bank s = new SBI(2000);
        Bank i = new ICICI(1500);
        Bank a = new AXIS(800);
        s.deposit(500);
        s.withdraw(700);
        i.deposit(300);
        i.withdraw(900);
        a.deposit(200);
        a.withdraw(600);
  }
}
