
import java.lang.Thread;
interface AccOps{
    void debit();
    void credit();
}
class DebitThread extends Thread{
    double balance, withdraw;
    synchronized void accept(double balance,double withdraw){
        this.balance=balance;
        this.withdraw=withdraw;
    }
    synchronized public void run(){
        System.out.println("Debiting Money");
        balance = balance - withdraw;
        System.out.println(withdraw+"Debited from account");
        System.out.println("Current Balance = "+balance);
    }
}
class CreditThread extends Thread{
    double balance, deposit;
    synchronized void accept(double balance, double deposit){
        this.balance=balance;
        this.deposit=deposit;
    }
    synchronized public void run(){
        System.out.println("Crediting Money....");
        balance=balance+deposit;
        System.out.println(deposit+"Credited to account");
        System.out.println("Current balance="+balance);
    }
}
class Account implements AccOps{
    double balance = 50000;
    double withdraw = 1000;
    double deposit = 20000;
    synchronized public void debit(){
        DebitThread debit = new DebitThread();
        debit.accept(balance,withdraw);
        debit.start();
    }
    synchronized public void credit(){
        CreditThread credit = new CreditThread();
        credit.accept(balance,deposit);
        credit.start();
    }
    public static void main(String[] args){
        System.out.println("State Bank of KITS");
        Account acc = new Account();
        System.out.println("My Bank Balance: "+acc.balance);
        acc.debit();
        acc.credit();
    }
}
