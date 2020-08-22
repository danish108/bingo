
package constructors;
import java.util.Scanner;
class UseArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr;
        System.out.println("Enter size of the Array:");
        int n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the values:");
            arr[i]=sc.nextInt();
        }
        ArrayDemo d=new ArrayDemo();
        double [] ans=d.calculate(arr);
        System.out.println("Sum is:"+ans[0]);
        System.out.println("Average is:"+ans[1]);
    }
    
}
