package br.com.impacta.arrays;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Array16 {
	public static void main(String[] args) {
		
		/*
		 * Neste exercicio o usuario vai fornecer
		 * dia
		 * mes
		 * ano
		 * 
		 * Com base nestas informações, determine quantos 
		 * dias restam para o ano informado terminar		 
		 */
		
		 int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));
		 int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês"));
		 int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
		 
		 if(mes < 1 || mes > 13) {
			 JOptionPane.showMessageDialog(null, "Mês inválido");
			 return;			 
		 }
			 
		 //19/3/87
		 //x + a soma dos meses.
		 
		 int[] meses = {31, ano % 4 == 0? 29 : 28 ,31,30,31,30,31,31,30,31,30,31}; 
		 
		 //if(ano % 4 == 0)
			// meses[1] = 29;
			 
		 //meses[mes-1] =
		 
		 //30 
		 
		               // 30  > (28 29)
		 if(dia < 1 || dia > meses[mes-1])
		 {
			 JOptionPane.showMessageDialog(null, "Dia inválido");
			 return;
		 }
		 
		 
		 //meses[mes-1] = representa a quantidade total de
		   //dia do mes.
		 
		 //x
		 
		 
		 int diasRestantes = meses[mes-1] - dia;
		 //5 maio.
		 
		               
		 for (int i = mes; i < meses.length; i++) {
			 diasRestantes += meses[i];
		}
		 		 
		 String resposta = "Faltam " + diasRestantes + " dias para terminar o ano";
		 
		 JOptionPane.showMessageDialog(null, resposta);	 
		
		
	}
}
