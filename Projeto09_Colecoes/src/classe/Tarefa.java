package classe;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class Tarefa {
	
	private Date data;
	private String descricao;
	private int duracao;
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Tarefa(Date data, String descricao, int duracao) {
		super();
		this.setData(data);
		this.setDescricao(descricao);
		this.setDuracao(duracao);
	}
	@Override
	public String toString() {
		
		String data = new SimpleDateFormat("dd/MM/yyyy").format(this.getData());
				
		Formatter fmt = new Formatter();
		
		String resposta = fmt.format("%10s  %-30s %8d%n",data,
				this.getDescricao(), this.getDuracao()).toString();
		
		fmt.close();		
		
		return resposta;
		
	}
	
	//toString();
	
	
	
	
	
	

}
