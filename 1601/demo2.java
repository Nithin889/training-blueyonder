import java.util.Scanner;
class Developer{
	String name,desig="Developer";
	int age,salary=100000;
	Scanner sc=new Scanner(System.in);
	Developer(){
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
	}
	
}
class Clerk{
	String name,desig="Clerk";
	int age,salary=40000;
	Scanner sc=new Scanner(System.in);
	Clerk(){
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
	}
}
class Manager{
	String name,desig="Manager";
	int age,salary=200000;
	Scanner sc=new Scanner(System.in);
	Manager(){
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
	}
}
public class demo2{
	public static void main(String args[]){
		Developer d1=null;
		Clerk c1=null;
		Manager m1=null;
		Scanner sc=new Scanner(System.in);
		int choice1,choice2;
		while(true){
			System.out.println("Enter choice 1: ");
			choice1=sc.nextInt();
			if(choice1==3){
				System.exit(0);
			}
			if(choice1==1){
				System.out.println("Enter choice 2: ");
				choice2=sc.nextInt();
				if(choice2==4){
					continue;
				}
				if(choice2==1){
					d1=new Developer();
				}
				if(choice2==2){
					c1=new Clerk();
				}
				if(choice2==3){
					m1=new Manager();
				}

			}
			if(choice1==2){
				System.out.println("Enter choice 2: ");
				choice2=sc.nextInt();
				if(choice2==4){
					continue;
				}
				if(choice2==1){
					System.out.println(d1.name+" "+d1.age+" "+d1.desig+" "+d1.salary);
				}
				if(choice2==2){
					System.out.println(c1.name+" "+c1.age+" "+c1.desig+" "+c1.salary);
				}
				if(choice2==3){
					System.out.println(m1.name+" "+m1.age+" "+m1.desig+" "+m1.salary);
				}	
			}
		}

		
		
	}
}