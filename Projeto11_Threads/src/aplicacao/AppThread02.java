package aplicacao;

import classe.Processo01;

public class AppThread02 {
	public static void main(String[] args) {
		
		//ojeto p represemta apenas a tarefas que a ser executada.		
		Processo01 p = new Processo01();
		
		Thread t1 = new Thread(p);
		t1.start();
		
		
		
	}

}
