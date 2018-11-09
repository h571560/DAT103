package no.hvl.dat103;

public class Semaphore {
	
	private int count;
	
	
	public void waits() throws InterruptedException{
		while(count <= 0) {
			Thread.sleep(50);
		}
		count --;
		
	}
	
	public void signal() {
		count++;
	}

}
