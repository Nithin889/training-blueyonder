import java.util.Scanner;
class Employee{
	int id,salary,age;
	String name,designation;
	Scanner sc=new Scanner(System.in);
	Employee(){
                    System.out.println("Id: ");
                    id = sc.nextInt();
                    System.out.println("Name: ");
                    name = sc.next();
                    System.out.println("Age: ");
                    age = sc.nextInt();
	}
    void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + designation);
    }
}
		

class Developer extends Employee{
	Developer(){
			salary = 50000;
			designation = "Developer";
	}

}

class Clerk extends Employee{
	Clerk(){
			    salary = 25000;
    				designation = "Clerk";
	}

}
class Manager extends Employee{
	Manager(){
		    salary = 90000;
    		designation = "Manager";
	}

}
class Tester extends Employee{
	Tester(){
		    salary = 40000;
    designation = "Tester";
	}

}

public class Inheritance{
    public static void main(String args[]){
        Developer d = null;
        Tester t = null;
        Manager m = null;
        Clerk c = null;

        int ch1 = 0;

        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Exit");

            System.out.println("Enter your choice.....");
            ch1 = sc.nextInt();

            if(ch1 == 1){ //create
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("5) Exit to main menu");

                System.out.print("Enter your choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
			d=new Developer();
                }
                if(ch2 == 2){ //Clerk
			c=new Clerk();
                }
                if(ch2 == 3){ //Tester
			t=new Tester();
                }
                if(ch2 == 4){ //Manager
			m=new Manager();
                }
                if(ch2 == 5){ //exit to main menu
                    continue;
                }
            }
            if(ch1 == 2){ //display
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("Exit to main menu");

                System.out.print("Enter your choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
                    if(d!=null)
                        d.display();
                    else
                        System.out.println("Developer Not yet registered");
                }
                if(ch2 == 2){ //Clerk
                    if(c!=null)
                        c.display();
                    else
                        System.out.println("Clerk Not yet registered");
                }
                if(ch2 == 3){ //Tester
                    if(t!=null)
                        t.display();
                    else
                        System.out.println("Tester Not yet registered");
                }
                if(ch2 == 4){ //Manager
                    if(m!=null)
                        m.display();
                    else
                        System.out.println("Manager Not yet registered");
                }
                if(ch2 == 5) { //exit to main menu
                    continue;
                }
            }
            if(ch1 == 3) {
                System.exit(0);
            }
        }while(ch1 != 5);
    }
}
