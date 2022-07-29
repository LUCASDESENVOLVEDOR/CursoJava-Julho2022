package aplicacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppExercicio03 {

	public static void main(String[] args) {		
		
		//3 - Escreva um programa Java que leia um arquivo TXT,
		//caso não localize adicione um tratamento.
		
		
		try {
			
			FileReader arquivo = new FileReader("C:\\Users\\Lucas - Senai\\Documents\\AULA04.txt");
			
			//classe que ira realizar a leitura.
			BufferedReader leitura = new BufferedReader(arquivo);
			
			//variavel que vai receber o que esta escrito no arquivo.
			String dados = null;
			
			while((dados = leitura.readLine()) != null) {				
				System.out.println(dados);				
			}			
			
				
			
			//System.out.println("Por enquanto tudo ok");
			
		}
		catch (FileNotFoundException  e) {			
			System.out.println("Arquivo não localizado.");			
		}		
		catch(IOException e) {
			System.out.println("Falha ao ler ou gravar informações no arquivo.");
		}
		
		
	}
}
