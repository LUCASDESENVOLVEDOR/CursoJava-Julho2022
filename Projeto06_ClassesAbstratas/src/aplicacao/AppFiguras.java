package aplicacao;

import javax.swing.JOptionPane;

import classe.Circulo;
import classe.Figura;
import classe.Retangulo;

public class AppFiguras {
	public static void main(String[] args) {	
		
		Retangulo ret = new Retangulo();
		ret.setBase(10);
		ret.setAltura(15);
		
		Circulo circ = new Circulo();
		circ.setRaio(5);
		
		apresentarFigura(ret);
		apresentarFigura(circ);		
	}
	
	private static void apresentarFigura(Figura figura) {
		
		String resposta = "Classe: " + figura.getClass().getName()+
				"\n¡rea: " + figura.calcularArea();
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
