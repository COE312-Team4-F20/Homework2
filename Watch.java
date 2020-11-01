
public class Watch implements Runnable{
	Flag f;

	Watch(boolean flag)
	{
		f = new Flag(flag);
		Thread t = new Thread(this);
		t.start();
		

	}
	synchronized Flag getFlag()
	{
		return f;
	}
	synchronized void setFlag(Flag f)
	{
		this.f = f;
		
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(60000);
			System.out.println("1 minute has passed");
			Thread.sleep(60000);
			System.out.println("2 minutes have passed");
			Thread.sleep(60000);
			System.out.println("3 minutes have passed! Quickly hide the map before someone catches you!");
			Thread.sleep(10000);
			
			if(f.flag == false) 
			{
				System.out.println("You've been caught! the Marauders map has been confiscated");
				System.exit(0);
			}
			else {
				System.exit(0);
			}
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
