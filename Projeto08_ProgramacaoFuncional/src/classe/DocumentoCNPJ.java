package classe;

import interfaces.Documento;

public class DocumentoCNPJ implements Documento {

	private String cnpj;
	
	
	public DocumentoCNPJ(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	@Override
	public void setNumero(String numero) {
       //numero diferente de 14 devolver erro NumberFormat.		
		if(!numero.matches("[0-9]{14}"))
			throw new NumberFormatException("O CNPJ dever ter 14 digitos.");
		
		this.cnpj = numero;
		
	}

	@Override
	public String getNumero() {
	
		return this.cnpj;
	}

}




















