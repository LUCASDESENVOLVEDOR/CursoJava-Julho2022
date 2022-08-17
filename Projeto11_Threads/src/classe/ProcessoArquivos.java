package classe;

import java.io.FileReader;

public class ProcessoArquivos implements Runnable {

	@Override
	public void run() {
		lerArquivo();		
	}
	public synchronized void lerArquivo() {
		
		try {
			//Classe FileWriter		
			FileReader reader = new
					FileReader("C:\\Users\\Lucas - Senai\\Documents\\CursoJava\\Arquivos\\arquivo01.txt"
	        		  );	
			
			//leitura do arquivo um caractere por vez.


			
			while (true) {
				
				int caractere = reader.read();
				//System.out.println(caractere);
				
				
				if(caractere == -1) {
					break;
				}
				
				char ch = (char)caractere;	
				System.out.println(ch);
				Thread.sleep(200);
				
			}
			
			
			
			
			reader.close();
			
			
		} catch (Exception e) {
			
		}
		
	}
	
	

}
