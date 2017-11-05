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
	@Override
	public String toString(){
		return this.nome+": "+this.props.toString()+"\n";
	}
	
	public String arquivoDestino(){
		return this.verificaMacro();
	}
	
	public String verificaMacro(){
		if(this.nome.contains("Author")){
			return "<macro name='author'>"+
		    "<names variable='author'>"+
		      "<name name-as-sort-order='all' sort-separator=', ' initialize-with='. ' delimiter='; ' delimiter-precedes-last='always'>"+
		        "<name-part name='family' text-case='uppercase'/>"+
		        "<name-part name='given' text-case='capitalize-all'/>"+
		      "</name>"+
		      "<et-al font-style='italic'/>"+
		      "<label form='short' prefix=' (' suffix='.)' text-case='capitalize-first'/>"+
		      "<substitute>"+
		        "<names variable='editor'/>"+
		        "<names variable='translator'/>"+
		        "<choose>"+
		          "<if match='none' type='motion_picture broadcast'>"+
		            "<text macro='title'/>"+
		          "</if>"+
		        "</choose>"+
		      "</substitute>"+
		    "</names>"+
		  "</macro>";
		}
		else if(this.nome.contains("Title")){
			return "<macro name='title'>"+
		    "<choose>"+
		      "<if match='any' type='chapter bill webpage post-weblog article-newspaper article-magazine    article-journal motion_picture paper-conference speech'>"+
		        "<text variable='title'/>"+
		      "</if>"+
		      "<else-if match='any' type='entry-encyclopedia entry-dictionary'>"+
		        "<choose>"+
		          "<if match='any' variable='author editor collection-editor translator'>"+
		            "<text variable='title'/>"+
		          "</if>"+
		          "<else>"+
		            "<text variable='title' text-case='uppercase'/>"+
		          "</else>"+
		        "</choose>"+
		      "</else-if>"+
		      "<else>"+
		        "<text variable='title' font-weight='bold'/>"+
		      "</else>"+
		    "</choose>"+
		  "</macro>";
		}
		else return "";
	}
}
