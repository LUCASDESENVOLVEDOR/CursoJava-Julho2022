package aplicacao;

import classe.Processo02;

public class AppThread03 {
	public static void main(String[] args) {
		
		//criando a tarefa.
	    Processo02 p = new Processo02();	
		
		//criando as tarefas.
	    Thread t1= new Thread(p);
	    t1.setName("Processo 1");
		
	    Thread t2= new Thread(p);
	    t2.setName("Processo 2"); 
	    t2.setPriority(Thread.MAX_PRIORITY);
	    
	    Thread t3= new Thread(p, "Processo 3");
	    
	    
	    t1.start();
	    t2.start();
	    t3.start();
		
	}

}
