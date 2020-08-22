
package constructors;

 class Employee {
     private int empId;
     private String empName;
     private int empAge;
     private static int nextId=1;
     
     public Employee(String name,int age)
     {
         empName=name;
         empAge=age;
         empId=nextId++;
     }
     public void show()
     {
         System.out.println("EmpId is"+empId);
         System.out.println("EmpName is"+empName);
         System.out.println("Emp age is"+empAge);
     }
     public void showNextId()
     {
         System.out.println("The next ID wil be!"+nextId);
     }
    
}
