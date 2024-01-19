class A extends Thread{
    public void run() {
        try {
            for(int i=0;i<=10;i++){
                System.out.println("i :"+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
class B extends Thread{
    public void run() {
        try {
            for(int j=10;j>=0;j--){
                System.out.println("    j :"+j);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        A a=new A();
        a.start();
        B b=new B();
        b.start();

    }
}
