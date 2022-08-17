package aplicacao;

import classe.Processo03;

public class AppProcesso03 {
	public static void main(String[] args) {
		
		Processo03 p3 = new Processo03();
		Thread t = new Thread(p3);
		t.start();
		
		
		synchronized (t) {
			try {
				System.out.println("Estou esperando...");
				t.wait();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Total é igual a: " + p3.total);	
		}
		
		
	}
}
