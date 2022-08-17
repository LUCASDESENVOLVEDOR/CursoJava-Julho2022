package classe;

import interfaces.Documento;

public class DocumentoCpf implements Documento {
	
	private String cpf;
	
	public DocumentoCpf(String cpf) {
		this.setNumero(cpf);
	}
	

	@Override
	public void setNumero(String numero) {
		//numero diferente de 11 devolver erro NumberFormat.		
		if(!numero.matches("[0-9]{11}"))
			throw new NumberFormatException("O CPF dever ter 11 digitos.");
		
		this.cpf = numero;
	}

	@Override
	public String getNumero() {		
		return this.cpf;
	}

}
