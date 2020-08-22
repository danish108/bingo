
package constructors;
import java.util.Scanner;
class UseBankAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details for 1st user:");
        int id=sc.nextInt();
        String na=sc.next();
        double b=sc.nextDouble();
        BankAccount b1=new BankAccount(id,na,b);
        System.out.println("Enter details of 2nd user");
         id=sc.nextInt();
         na=sc.next();
         b=sc.nextDouble();
        BankAccount b2=new BankAccount(id,na,b);
        b1.showDetails();
        b2.showDetails();
        System.out.println("Enter amount to transfer:");
        double amt=sc.nextDouble();
        boolean ans;
        ans=b1.transfer(b2,amt);
        if(ans=true)
            System.out.println("Transfer done successfully:");
        else
            System.out.println("Insufficient balance to transfer!:");
        System.out.println("AFTER TRANSFERING");
            b1.showDetails();
            b2.showDetails();
    }
    
}
