
package constructors;

class Employe {
    private int empId;
    private String empName;
    private int empAge;
    private static int nextId=1;
    
    public Employe(String name,int age)
    {
        empName=name;
        empAge=age;
        empId=nextId++;
    }
    public void show()
    {
        System.out.println("emp id="+empId+",name="+empName+",age="+empAge);
    }
    public static void shownextId()//this becomes object free
    {
        System.out.println("The next id will be:"+nextId);
    }
    protected void finalize()//comes from Object claas
    {
        --nextId;
    }
    
}
