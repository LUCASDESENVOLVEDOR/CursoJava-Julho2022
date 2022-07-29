package classes;

public class Automovel {
	
	//Quando criamos um constante (STATIC + FINAL)
	 //o nome deve ser maiusculo.
	public static final String PAIS_ORIGEM = "Brasil";
	
	
	
	//atributos.
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
	//THIS = Referencia da própria classe.
	 // é uma refernecia que serve para termos acesso a todos 
	  // os atributos da classe. (Atributos e metodos).
	
	//Toda classe possui um this. 
	
	
	private final int chassi;	
	
	//construtor
	public Automovel(String marca, String modelo) {	
		this.chassi = (int)(Math.random()* 1000);
		this.setMarca(marca);
		this.setModelo(modelo);	
	}
	
//	//sobrecarga de método.
	public Automovel(String marca, String modelo, int ano) {
		this(marca,modelo);
		this.setAno(ano);
	}
//	
	public Automovel(String marca, String modelo, int ano, String placa) {		
		this(marca,modelo,ano);		
		this.setPlaca(placa);
	}
	
	
	
	
	
	public String mostrar() {
		
		String titulo = "DADOS DO AUTOMÓVEL";
		
		String resposta = titulo + "\nMarca: " + this.getMarca() + 
				"\nModelo: " + this.getModelo() + 
		        "\nChassi: " + this.getChassi();
		
		       if(this.getAno() > 0 ) 
		    	   resposta += "\nAno: " + this.getAno();
		       
				if(this.getPlaca() != null)
					resposta += "\nPlaca: " + this.getPlaca();
		       
		       
				resposta +="\nPais Origem: " + PAIS_ORIGEM;
			
		
		return resposta;	
		
	}
	

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		
		if(ano < 1970)
			throw new NumberFormatException("O ano não pode ser menor que 1970");
		
		
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getChassi() {
		return chassi;
	}
	
	
	

}
