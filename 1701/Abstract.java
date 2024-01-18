abstract class Bank{
	abstract void loan();
}
class SBI extends Bank{
	void loan(){
		System.out.println("Hi");
	}
}
class Abstract{
public static void main(String args[]){
	SBI b1=new SBI();
	b1.loan();
}}	