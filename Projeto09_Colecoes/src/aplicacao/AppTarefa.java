package aplicacao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import classe.Tarefa;

public class AppTarefa {
	public static void main(String[] args) {
		
		    try {
		    	
		   
		   //Data e Hora atuais.
		   Date data = new Date();
		  
		   
		   //Obtendo uma data do usuario		   
		   String sdata = JOptionPane.showInputDialog("Informe uma data (dd/mm/aaaa)");
		   
		   //Convertendo o texto para um objeto date.
		   DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		   Date dataUser = df.parse(sdata);
		   
		   //System.out.println(df.format(data));
		   //System.out.println(df.format(dataUser));
		   
		   Tarefa t1 = new Tarefa(new Date(), "Gerar Relatório", 10);
		   Tarefa t2 = new Tarefa(dataUser, "Imprimir Recibo e NF", 5);
		   
			
		   System.out.println(t1);
		   System.out.println(t2);
		   
		   
		   
		   
		    }
			
		   catch(ParseException e) {			   
			   e.printStackTrace();
		   }		   
		   
	}

}
