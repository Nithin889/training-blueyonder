import java.util.Scanner;
interface Company{
    void access();
}
abstract class Employee{
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
	abstract void raiseSal();

}
		

class Developer extends Employee implements Company{
	Developer(){
			salary = 50000;
			designation = "Developer";
	}
	void raiseSal(){
		salary+=(15/100f)*salary;
	}
    void access(){
        System.out.println("A block");
    }

}

class Clerk extends Employee{
	Clerk(){
			    salary = 25000;
    				designation = "Clerk";
	}
	void raiseSal(){
		salary+=(5/100f)*salary;
	}
    void access(){
        System.out.println("A block & B block");
    }

}
class Manager extends Employee{
	Manager(){
		    salary = 90000;
    		designation = "Manager";
	}
		void raiseSal(){
		salary+=(10/100f)*salary;
	}
    void access(){
        System.out.println("A block, B block & C block");
    }

}
class Tester extends Employee{
	Tester(){
		    salary = 40000;
    designation = "Tester";
	}
		void raiseSal(){
		salary+=(20/100f)*salary;
	}
    void access(){
        System.out.println("C block");
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
		System.out.println("3) Raise salary");
            System.out.println("4) Access");
            System.out.println("5) Exit");

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
		if(ch1==3){
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("Exit to main menu");

                System.out.print("Enter your choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
                    if(d!=null){
			if(d.salary==50000){
				                        d.raiseSal();
			System.out.println("Salary is updated");
			}
			else{
System.out.println("can't update salary");
			}

		}
                    else
                        System.out.println("Developer Not yet registered");
                }
                if(ch2 == 2){ //Clerk
                    if(c!=null){
                        c.raiseSal();
			System.out.println("Salary is updated");
		}
                    else
                        System.out.println("Clerk Not yet registered");
                }
                if(ch2 == 3){ //Tester
                        if(t!=null){
                        t.raiseSal();
			System.out.println("Salary is updated");
		}
                    else
                        System.out.println("Tester Not yet registered");
                }
                if(ch2 == 4){ //Manager
                    if(m!=null){
                        m.raiseSal();
			System.out.println("Salary is updated");
		}
                    else
                        System.out.println("Manager Not yet registered");
                }
                if(ch2 == 5) { //exit to main menu
                    continue;
                }
			
		}
            if(ch1==3){
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("Exit to main menu");

                System.out.print("Enter your choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
                    if(d!=null){
                        d.access();

                    }
                    else
                        System.out.println("Developer Not yet registered");
                }
                if(ch2 == 2){ //Clerk
                    if(c!=null){
                        c.access();
                    }
                    else
                        System.out.println("Clerk Not yet registered");
                }
                if(ch2 == 3){ //Tester
                    if(t!=null){
                        t.access();
                    }
                    else
                        System.out.println("Tester Not yet registered");
                }
                if(ch2 == 4){ //Manager
                    if(m!=null){
                        m.access();
                    }
                    else
                        System.out.println("Manager Not yet registered");
                }
                if(ch2 == 5) { //exit to main menu
                    continue;
                }

            }
            if(ch1 == 5) {
                System.exit(0);
            }
        }while(true);
    }
}
