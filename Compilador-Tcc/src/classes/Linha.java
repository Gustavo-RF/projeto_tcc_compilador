package classes;

import java.util.LinkedList;

public class Linha {
	private LinkedList<String> elementos;
	
	public Linha(){
		this.elementos = new LinkedList<String>();
	}

	public LinkedList<String> getElementos() {
		return elementos;
	}

	public void setElementos(LinkedList<String> elementos) {
		this.elementos = elementos;
	}
	
	public void insere(String elemento){
		this.elementos.add(elemento);
	}
	
	@Override
	public String toString(){
		return this.elementos.toString();
	}
	
	public String arquivoSaida(){
		String saida = null;
        saida +="<if type='article-newspaper' match='any'>";
        saida +="<group delimiter='. ' suffix='. '>";
        saida +="<text macro='author'/>";
        saida +="<text macro='title'/>";
        saida +="<group delimiter=', '>";
        saida +="<text macro='container-title'/>";
        saida +="<text macro='place'/>";
        saida +="<text macro='issued'/>";
        saida +="</group>";
        saida +="<text variable='collection-title'/>";
        saida +="<text macro='edition'/>";
        saida +="<text macro='locators'/>";
        saida +="<text macro='access'/>";
        saida +="</group>";
		return saida;
	}
}
