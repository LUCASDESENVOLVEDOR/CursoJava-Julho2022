package classe;

public class Processo03 implements Runnable {

	public int total = 0;
	
	
	@Override
	public void run() {
		
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			notify();
			//notifyAll();
		}
		
		
		
	}

}
