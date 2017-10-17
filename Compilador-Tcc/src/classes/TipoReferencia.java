package classes;

public class TipoReferencia {
	private ListaLinhas linhas;
	private String nome;
	
	public TipoReferencia(){
		this.linhas = new ListaLinhas();
		this.nome = null;
	}
	
	public TipoReferencia(String nome, ListaLinhas linhas){
		this.linhas = linhas;
		this.nome = nome;
	}

	public ListaLinhas getLinhas() {
		return linhas;
	}

	public void setLinhas(ListaLinhas linhas) {
		this.linhas = linhas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString(){
		return "#########\n"+this.nome+":\n"+linhas.toString()+"\n";
	}
}
