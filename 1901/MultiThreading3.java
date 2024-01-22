class Car extends Thread{
    public void run() {
        try {
            for(int i=0;i<=30;i++){
                System.out.println(Thread.currentThread().getName()+" :"+i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
public class MultiThreading3 {

    public static void main(String[] args) {
        try{
            Car car=new Car();
            Thread t1=new Thread(car);
            Thread t2=new Thread(car);
            t1.setName("Mustang");
            t2.setName("Ferari");
            t1.start();
            t2.start();
            for(int i=0;i<=30;i++){
                if(i==10){
                    t1.suspend();
    
                }`
                if(i==15){
                    t2.suspend();
                }
                if(i==20){
                    t2.resume();
                }
                if(i==25){
                    t2.resume();
                }
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


}
