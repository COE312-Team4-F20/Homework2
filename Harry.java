
public class Harry extends Student implements Runnable {
	Flag foundhermione;
	Harry(Location location, Flag fh)
	{
	
		super(location,"Harry", "male");
		this.foundhermione = fh;
		Thread t = new Thread(this);
		t.start();
	}
	synchronized void setLocation(Location loc)
	{
		this.studentlocation = loc;
	}
	synchronized Location getLocation()
	{
		return this.studentlocation;
	}
	@Override
	public void run() {
		
		while(true)
		{
			synchronized(this.foundhermione) {
				if (this.foundhermione.flag == true) {
					System.out.println("Harry: Found Hermione!");
					break;
				}
			}
		}

		
	}
	
	

}
