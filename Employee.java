public class Employee
{
    String name;
    String post;
    String address;
    int age;
    int phonenumber;
    int Salary;
    public void printsalary()
    {
        System.out.println("\nSalary:" + Salary + "\n");
    }
    public void printInfo()
    {
        System.out.println(post + "\n\nName: " + name + "\n\nAge: " + age + "\n\nPhone Number: " + phonenumber
                + "\n\nSalary: " + Salary + "\n\nAddress: " + address);
    }
    public static void main(String[] args)
    {
        System.out.println("EMPLYOEE LIST\n");
        Officer officer1 = new Officer("OFFICER", "Rahul", 25, 123455678, 100000, "Kozhikode\n");
        officer1.printsalary();
        officer1.printspec();
        Manager manager1 = new Manager("MANAGER", "Ruby", 23, 123456789, 120000, "Kochi");
        manager1.printsalary();
        manager1.printdep();
    }
}
class Officer extends Employee
{
    String spec;
    Officer(String post, String name, int age, int phonenumber, int Salary, String address)
    {
        this.post = post;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.Salary = Salary;
        this.address = address;
        this.printInfo();
        this.printspec();
    }
    Officer(String post, String name, int age, int phonenumber, int Salary, String address, String spec)
    {
        this.post = post;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.Salary = Salary;
        this.address = address;
        this.spec = spec;
        this.printInfo();
    }
    public void printspec()
    {
        System.out.println("Specialisation:" + spec);
    }
}
class Manager extends Employee
{
    String dep;
    Manager(String post, String name, int age, int phonenumber, int Salary, String address)
    {
        this.post = post;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.Salary = Salary;
        this.address = address;
        this.printInfo();
        this.printdep();
    }
    Manager(String post, String name, int age, int phonenumber, int Salary, String address, String dep)
    {
        this.post = post;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.Salary = Salary;
        this.address = address;
        this.dep = dep;
        this.printInfo();
    }
    public void printdep()
    {
        System.out.println("Department:" + dep);
    }
}