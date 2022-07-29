package aplicacao;

import classes.ExcecaoPlaca;
import classes.Veiculo;

public class AppVeiculo01 {

	public static void main(String[] args) {
		
		try {
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca("AAA1010");
		
		System.out.println(veiculo.getPlaca());
		
		veiculo.setPlaca("AAA");		
		
		}
		catch (ExcecaoPlaca e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
