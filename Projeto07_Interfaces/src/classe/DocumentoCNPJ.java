package classe;

import interfaces.Documento;

public class DocumentoCNPJ implements Documento {

	private String cnpj;
	
	
	@Override
	public void setNumero(String numero) {
       //numero diferente de 11 devolver erro NumberFormat.		
		if(!numero.matches("[0-9]{14}"))
			throw new NumberFormatException("O CNPJ dever ter 14 digitos.");
		
		this.cnpj = numero;
		
	}

	@Override
	public String getNumero() {
	
		return this.cnpj;
	}

}




















