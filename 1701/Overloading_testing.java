class Parent{
	void method1(){
		System.out.println(1);
	}
	int method1(){
		System.out.println(2);
		return 2;
	}
}
class Overloading_testing{
	public static void main(String args[]){
		Parent p1=new Parent();
		p1.method1();
	}
}