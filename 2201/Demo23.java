class A extends Thread 
{
	public synchronized void run() 
	{	
		try
		{
			for(int i=0;i<=5;i++)
			{	
				if(Thread.currentThread().getName().equals("Rama"))
				{
					System.out.println("Rama :"+i);	
				
				}
				if(Thread.currentThread().getName().equals("Seetha"))
				{
					System.out.println("	Seetha :"+i);	
				
				}		
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Demo23
{
	public static void main(String args[])
	{
		A a = new A();
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		
		t1.start();
		t2.start();
		
		t1.setName("Rama");
		t2.setName("Seetha");

	}
}