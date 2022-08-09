package aplicacao;

import interfaces.Operacao02;

public class AppOperacao02 {

	public static void main(String[] args) {
		
		Operacao02 op1 = () -> Math.random();
		
		//crie op2 e op3 assim como o op1 para retornar
		// um double ao executar o metodo "executar"		
		
		System.out.println(op1.executar());
	}
}
