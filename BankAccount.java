
package constructors;
import java.util.Scanner;
class BankAccount {
    private int AI;
    private String name;
    private double balance;
    
    public BankAccount(int ai,String nam,double bal)
    {
        AI=ai;
        name=nam;
        balance=bal;
    }
    public void showDetails()
    {
        System.out.println("Account id is "+AI);
        System.out.println("Name is "+name);
        System.out.println("Balance is"+balance);
    }
    public boolean transfer(BankAccount q,double amt)
    {
        if(balance<amt)
            return false;
        else
        {
            balance=balance-amt;
            q.balance=q.balance+amt;
            return true;
        }
    }
    
}
