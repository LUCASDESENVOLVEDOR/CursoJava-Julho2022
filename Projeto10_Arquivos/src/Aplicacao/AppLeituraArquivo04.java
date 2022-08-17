package Aplicacao;

import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AppLeituraArquivo04 {
	public static void main(String[] args) {
		
		try {
			//Classe FileWriter		
			FileWriter writer = new
					FileWriter("C:\\Users\\Lucas - Senai\\Documents\\CursoJava\\Arquivos\\funcionarios.csv"
	        		  );	
			
			//Obtendo os dados do funcionario			
			String nome = JOptionPane.showInputDialog("Nome do Funcionario");	
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do funcionario"));			
			String documento = JOptionPane.showInputDialog("CPF do funcionario");				
			String cargo = JOptionPane.showInputDialog("Cargo do funcionario");				
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do funcionario"));
			
			//gerando uma lista com dados separados por caractere ";"
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(nome).append(";")
			  .append(idade).append(";")
			  .append(documento).append(";")
			  .append(cargo).append(";")
			  .append(salario).append("\n");
			
			writer.write(sb.toString());
			writer.close();
			//writer.flush();
			
			JOptionPane.showMessageDialog(null, "Dados gerados com sucesso!");
						
			
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());		
				
			}
			
			
			
		}
	
}
