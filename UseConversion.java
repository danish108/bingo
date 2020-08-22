import java.util.Scanner;
class Conversion
{
private double val1,val2;
public Conversion(double val1)
{
this.val1=val1;
}
public double getval1()
{
return val1;
}
public void conVert()
{
System.out.println("Converting val1 into val2");
}
}
class LtoG extends Conversion
{
private double val2;
public LtoG(double val2)
{
super(val2);
//this.val2=val2;
}
public void conVert()
{
double val2;
val2=getval1()/3.755;
System.out.println("Converted to Gallon..."+val2);
}
}
class FtoC extends Conversion
{
private double val2;
public FtoC(double val2)
{
super(val2);
//this.val2=val2;
}
public void conVert()
{
double val2;
val2=(getval1()-32)*5/9;
System.out.println("Converted to Celsius..."+val2);
}
}
class UseConversion
{
public static void main(String[] args)
{
Scanner kb=new Scanner(System.in);
Conversion c;
//System.out.println("Enter value");
double val;
System.out.println("Select a Conversion");
System.out.println("1:LtoG\n2:FtoC");
int choice;
choice=kb.nextInt();

switch(choice)
	{
	case 1:
	//c=new LtoG(val);
	System.out.println("Enter Litres:");
	val=kb.nextDouble();
	c=new LtoG(val);
	c.conVert();
	break;
	case 2:
	//c=new FtoC(val);
	System.out.println("Enter Fahrenhite:");
	val=kb.nextDouble();
	c=new FtoC(val);
	c.conVert();
	break;
	default:
	System.out.println("Wrong choice!!try again..");
	}
}
}
	