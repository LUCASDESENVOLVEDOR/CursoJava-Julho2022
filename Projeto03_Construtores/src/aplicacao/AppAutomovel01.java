package aplicacao;

import javax.swing.JOptionPane;

import classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {
		
		Automovel auto = new Automovel("Hyundai","HB20");
		JOptionPane.showMessageDialog(null, auto.mostrar()); 					
		
		Automovel auto2 = new Automovel("Hyundai","HB20",2019);
		JOptionPane.showMessageDialog(null, auto2.mostrar()); 		
		
		Automovel auto3 = new Automovel("Hyundai","HB20",2019, "AAA0000");	
		JOptionPane.showMessageDialog(null, auto3.mostrar());
		
	}
}





















