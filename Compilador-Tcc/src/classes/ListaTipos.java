package classes;

import java.util.LinkedList;

public class ListaTipos {
	private LinkedList<Tipo> tipos;
	
	public ListaTipos(){
		this.tipos = new LinkedList<Tipo>();
	}

	public LinkedList<Tipo> getTipos() {
		return tipos;
	}

	public void setTipos(LinkedList<Tipo> tipos) {
		this.tipos = tipos;
	}
	
	public void insere(Tipo tipo){
		this.tipos.add(tipo);
	}
}
