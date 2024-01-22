import java.util.*;
interface company
{
    public abstract void access();
    public static final String company_name="Blue yonder";
    default void advsal() {
        System.out.println("Advanced salary is given");
    }
    static void cab()
    {
        System.out.println("Cab is allowed");
    }
}
abstract class Emp
{
    public int age,id,x,b;
    private double salary;
    public String designation;

    void setsal(double salary)
    {
        this.salary=salary;
    }

    double getsal()
    {
        return salary;
    }

    public String name;
    void create()
    {
        x=1;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            name = sc.nextLine();
            System.out.println("Enter your id:");
            id = sc.nextInt();
            System.out.println("Enter your age:");
            age = sc.nextInt();
        }
        catch(InputMismatchException ime)
        {
            System.out.println("InputMismatchException Found:");
        }
    }
    void display()
    {
        if(x==0)
        {
            System.out.println("Record not found");
        }
        else
        {
            System.out.println("Name is:"+name);
            System.out.println("Id is:"+id);
            System.out.println("Age is:"+age);
            System.out.println("Salary is:"+salary);
            System.out.println("Designation is:"+designation);
            System.out.println("Company name is:"+company.company_name);
        }
    }
    void incre(double a)
    {
        if(b==0)
            salary=salary*a;

        b=1;
    }
    abstract double pf();
}
final class Developer extends Emp implements company
{
    Developer()
    {
        setsal(50000);
        designation="Developer";
    }

    double salary=getsal();
    double pf()
    {
        return 0.10*salary;
    }
    public void access()
    {
        System.out.println("A block");
        //company c=new company();
       // company.advsal();
        company.cab();
    }


}
final class Clerk extends Emp implements company
{
    Clerk()
    {
        setsal(20000);
        designation="Clerk";
    }
    double salary=getsal();
    double pf()
    {
        return 0.09*salary;
    }
    public void access()
    {
        System.out.println("C block");
    }
}
final class Manager extends Emp implements company
{
    Manager()
    {
        setsal(90000);
        designation="Manager";
    }
    double salary=getsal();
    double pf()
    {
        return 0.08*salary;
    }
    public void access()
    {
        System.out.println("A and D block");
    }
}
final class Tester extends Emp implements company
{
    Tester()
    {
        setsal(25000);
        designation="Tester";
    }
    double salary=getsal();
    double pf()
    {
        return 0.08*salary;
    }
    public void access()
    {
        System.out.println("D block");
    }
}
public class Project {
    public static void main(String args[]) {
        int x = 0;
        Developer d []= new Developer[10];
        Clerk c[] = new Clerk[10];
        Manager m[] = new Manager[10];
        Tester t[] = new Tester[10];
        int d1=0,c1=0,m1=0,t1=0;
        while (x>=0&&x<=6) {
            System.out.println("1 for create:");
            System.out.println("2 for display:");
            System.out.println("3 for update");
            System.out.println("4 for pf");
            System.out.println("5 for access id");
            System.out.println("6 for exit");
            try {
                Scanner sc = new Scanner(System.in);
                x = sc.nextInt();
                if (x == 1) {
                    System.out.println("1 for Developer:");
                    System.out.println("2 for Clerk:");
                    System.out.println("3 for Manager:");
                    System.out.println("4 for Tester:");
                    System.out.println("5 for Exit");
                    int y;
                    y = sc.nextInt();
                    if (y == 1) {
                        d[d1]=new Developer();
                        d[d1++].create();
                    } else if (y == 2) {
                        c[c1]=new Clerk();
                        c[c1++].create();
                    } else if (y == 3) {
                        m[m1]=new Manager();
                        m[m1++].create();
                    } else if (y == 4) {
                        t[t1]=new Tester();
                        t[t1++].create();
                    }
                } else if (x == 2) {
                    System.out.println("1 for Developer:");
                    System.out.println("2 for Clerk:");
                    System.out.println("3 for Manager:");
                    System.out.println("4 for Tester:");
                    System.out.println("5 for Exit");
                    int y;
                    y = sc.nextInt();
                    System.out.println("Enter index");
                    int i=sc.nextInt();

                    if (y == 1) {
                        d[i].display();
                    } else if (y == 2) {
                        c[i].display();
                    } else if (y == 3) {
                        m[i].display();
                    } else if (y == 4) {
                        t[i].display();
                    }
                } else if (x == 3) {
                    System.out.println("1 for Developer:");
                    System.out.println("2 for Clerk:");
                    System.out.println("3 for Manager:");
                    System.out.println("4 for Tester:");
                    System.out.println("5 for Exit");
                    int y;
                    y = sc.nextInt();
                    System.out.println("Enter index");
                    int i=sc.nextInt();
                    if (y == 1) {
                        d[i].incre(1.15);
                    } else if (y == 2) {
                        c[i].incre(1.05);
                    } else if (y == 3) {
                        m[i].incre(1.20);
                    } else if (y == 4) {
                        t[i].incre(1.10);
                    }
                } else if (x == 4) {
                    System.out.println("1 for Developer:");
                    System.out.println("2 for Clerk:");
                    System.out.println("3 for Manager:");
                    System.out.println("4 for Tester:");
                    System.out.println("5 for Exit");
                    int y;
                    y = sc.nextInt();
                    System.out.println("Enter index");
                    int i=sc.nextInt();
                    if (y == 1) {
                        System.out.println(d[i].pf());
                    } else if (y == 2) {
                        System.out.println(c[i].pf());
                    } else if (y == 3) {
                        System.out.println(m[i].pf());
                    } else if (y == 4) {
                        System.out.println(t[i].pf());
                    }
                } else if (x == 5) {
                    System.out.println("1 for Developer:");
                    System.out.println("2 for Clerk:");
                    System.out.println("3 for Manager:");
                    System.out.println("4 for Tester:");
                    System.out.println("5 for Exit");
                    int y;
                    y = sc.nextInt();
                    System.out.println("Enter index");
                    int i=sc.nextInt();
                    if (y == 1) {
                        d[i].access();
                    } else if (y == 2) {
                        c[i].access();
                    } else if (y == 3) {
                        m[i].access();
                    } else if (y == 4) {
                        t[i].access();
                    }
                }
            }
            catch(InputMismatchException ime)
            {
                System.out.println("InputMismatchException Found:");
            }
        }
    }
}
