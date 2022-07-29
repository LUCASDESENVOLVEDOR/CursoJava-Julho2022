package classes;

public class Veiculo {
	
	private String placa;
	private String chassi;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) throws ExcecaoPlaca {
		
		if(placa == null || placa.length() != 7)
			throw new ExcecaoPlaca("A placa deve ter 7 digitos");
		
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	
	
	

}
