package aplicacao;

import javax.swing.JOptionPane;

import classe.Circulo;

import classe.Retangulo;
import interfaces.Figura;

public class AppFiguras {
	public static void main(String[] args) {	
		
		Retangulo ret = new Retangulo();
		ret.setBase(10);
		ret.setAltura(15);
		
		Circulo circ = new Circulo();
		circ.setRaio(5);
		
		//apresentar os dados
		JOptionPane.showMessageDialog(null, circ.apresentarFigura());
		JOptionPane.showMessageDialog(null, ret.apresentarFigura());
		
		
	}
	
//	private static void apresentarFigura(Figura figura) {
//		
//		String resposta = "Classe: " + figura.getClass().getName()+
//				"\n¡rea: " + figura.calcularArea();
//		
//		JOptionPane.showMessageDialog(null, resposta);
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
