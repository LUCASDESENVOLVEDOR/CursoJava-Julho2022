package Aplicacao;

import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppLeituraArquivo02 {
	public static void main(String[] args) {
		
		try {
		//Classe FileWriter		
		FileReader reader = new
				FileReader("C:\\Users\\Lucas - Senai\\Documents\\CursoJava\\Arquivos\\arquivo01.txt"
        		  );	
		
		//leitura do arquivo um caractere por vez.
		
		//String arquivo = "";
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			
			int caractere = reader.read();
			//System.out.println(caractere);
			
			
			if(caractere == -1) {
				break;
			}
			
			char ch = (char)caractere;			
			sb.append(ch);
		}
		
		
		System.out.println(sb);
		
		reader.close();
		
		
		
		
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());		
			
		}
		
		
		
	}
	
}
