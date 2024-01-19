class A extends Thread{
    public void run() {
        try {
            int h=0,m=0,s=0;
            for(int i=0;i<=50000;i++){
                if(s<59){
                    s++;
                }else{
                    if(m<59){
                        m++;
                    }
                    else{
                        h++;
                        m=0;
                    }
                    s=0;
                }
                System.out.print(h+" "+m+" "+s);
                System.out.print("\r");
                Thread.sleep(10);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
public class MultiThreading2 {
    public static void main(String[] args) {
        A a=new A();
        a.start();


    }
}
