
package constructors;
class UseEmployee {
    public static void main(String[] args) {
        Employee e=new Employee("Ajay",24);
        Employee f=new Employee("Vineet",23);
        Employee g=new Employee("varun",22);
        e.show();
        f.show();
        g.show();
        e.showNextId();
        {
            System.out.println("Internship begins:");
            Employee x=new Employee("danish",20);
            Employee y=new Employee("farzaan",20);
            x.show();
            y.show();
            x.showNextId();
            y.showNextId();
            System.out.println("Internship ends.....");
        }
        e.showNextId();
    }
    
}
