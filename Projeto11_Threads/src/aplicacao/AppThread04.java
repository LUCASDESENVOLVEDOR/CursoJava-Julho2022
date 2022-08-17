package aplicacao;

public class AppThread04 {
	public static void main(String[] args) {
		
		Thread t = new Thread( 
				() -> {
				    System.out.println("Nome da thread: " + Thread.currentThread().getName());
				});		
		
		t.start();	
				
	}

}
