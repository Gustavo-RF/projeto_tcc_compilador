package classes;

import java.util.LinkedList;

public class Macro {
	private String nome;
	private LinkedList<String> props;
	
	public Macro(){
		this.props = new LinkedList<String>();
		this.nome = null;
	}
	
	public Macro(String nome, LinkedList<String> props){
		this.props = props;
		this.nome = nome;
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
	public void insere(String prop){
		this.props.add(prop);
	}
}
