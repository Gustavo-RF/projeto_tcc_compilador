package classes;

import java.util.LinkedList;

public class ListaLinhas {
	private LinkedList<Linha> linhas;

	public ListaLinhas(){
		this.linhas = new LinkedList<Linha>();
	}

	public LinkedList<Linha> getLinhas() {
		return linhas;
	}

	public void setLinhas(LinkedList<Linha> linhas) {
		this.linhas = linhas;
	}
	
	public void insere(Linha linha){
		this.linhas.add(linha);
	}
	
	@Override
	public String toString(){
		return this.linhas.toString();
	}
}
