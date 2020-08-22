import java.util.Scanner;
class Circle
{
private int radius;

public Circle(int radius)
{
this.radius=radius;
}
public int getRadius()
{
return radius;
}
public double area()
{
return 2*Math.PI*Math.pow(radius,2);
}
}

class Cylndr extends Circle
{
private double height;

public Cylndr(int radius,double height)
{
super(radius);
this.height=height;
}

public double area()
{
return 2*super.area()+2*Math.PI*getRadius()*height;
}
public double volume()
{
return super.area()*height;
}
}
class UseCylndr
{
public static void main(String[] args)
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter the radius and height:");
int r,h;
r=kb.nextInt();
h=kb.nextInt();
Cylndr obj=new Cylndr(r,h);
System.out.println("Area of cylndr: "+obj.area());
System.out.println("Volume of cylndr: "+obj.volume());
}
}