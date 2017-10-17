package classes;

import java.util.Iterator;
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
	@Override
	public String toString(){
		return this.macros.toString();
	}
	
	public String codigoDestino(){
		String ret = "";
		Iterator<Macro> i = this.macros.iterator();
		while (i.hasNext()) {
			ret+=i.next().verificaMacro();
		}
		return ret;
	}
}
