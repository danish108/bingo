package constructors;
import java.util.Scanner;
 class UseArraysum {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int arr[];
         int n;
         System.out.println("Enter the size of Array");
         n=sc.nextInt();
         arr=new int[n];
         for(int i=0;i<n;i++)
         {
             System.out.println("Enter values");
             arr[i]=sc.nextInt();
         }
         Arraysum d=new Arraysum();
         int sum=d.sum(arr);
        System.out.println("Sum is:"+sum);
         //d.show();
     }
    
}
