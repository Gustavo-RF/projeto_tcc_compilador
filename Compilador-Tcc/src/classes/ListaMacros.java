package classes;

import java.util.LinkedList;

public class ListaMacros {
	private LinkedList<Macro> macros;
	
	public ListaMacros(){
		this.macros = new LinkedList<Macro>();
	}

	public LinkedList<Macro> getMacros() {
		return macros;
	}

	public void setMacros(LinkedList<Macro> macros) {
		this.macros = macros;
	}
	public void insere(Macro macro){
		this.macros.add(macro);
	}
}
