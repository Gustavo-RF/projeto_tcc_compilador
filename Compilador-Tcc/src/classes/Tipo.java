package classes;

import java.util.LinkedList;

public class Tipo {
	private String nome;
	private LinkedList<String> props;
		
	public Tipo(){
		this.props = new LinkedList<String>();
		this.nome = null;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LinkedList<String> getProps() {
		return props;
	}
	public void setProps(LinkedList<String> props) {
		this.props = props;
	}
	
	public void insere(String tipo){
		this.props.add(tipo);
	}
}
