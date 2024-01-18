import java.util.Scanner;
class Employee{
String name;
int age;
long salary;
Scanner sc=new Scanner(System.in);

Employee(){
		System.out.print("Enter name: ");
		name=sc.next();
		System.out.print("Enter age: ");
		age=sc.nextInt();

		System.out.print("Enter salary: ");
		salary=sc.nextInt();
}
void display(){
System.out.println(name+" "+age+" "+salary);
}
}

public class Demo{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
int ch=0;
		
		while(true){
			System.out.println("Enter the choice :");
System.out.println("1)Developer");
System.out.println("2)Manager");
System.out.println("3)Clerk");
System.out.println("4)Exit");
int ch=sc.nextInt();
switch(ch){
case 1:{
break;
}
case 2:{
break;
}
case 3:{
break;
}
case 4:{
System.exit(0);
}

		
	}
}