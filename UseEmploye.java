///this code need some modification
package constructors;
import java.util.Scanner;
class UseEmploye {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details of the 1st employee");
        int ag=sc.nextInt();
        String nam=sc.next();
        Employe.shownextId();
        Employe e=new Employe(nam,ag);
        System.out.println("Enter details of 2nd Employee");
        ag=sc.nextInt();
        nam=sc.next();
        Employe f=new Employe(nam,ag);
        System.out.println("Enter details of 3rd employee");
        ag=sc.nextInt();
        nam=sc.next();
        Employe g=new Employe(nam,ag);
        e.show();
        f.show();
        g.show();
        Employe.shownextId();
        {
            System.out.println("Internship begins....");
            System.out.println("Enetr the details of 1st intern....");
            ag=sc.nextInt();
            nam=sc.next();
            Employe x=new Employe(nam,ag);
            System.out.println("Enetr details of 2nd intern...");
            Employe y=new Employe(nam,ag);
            x.show();
            y.show();
            Employe.shownextId();
            System.out.println("Internship ends....");
            x=y=null;
            System.gc();
            System.runFinalization();
        }
        Employe.shownextId();
        e=f=g=null;
        System.gc();
        System.runFinalization();
        //}
    }
    
}
