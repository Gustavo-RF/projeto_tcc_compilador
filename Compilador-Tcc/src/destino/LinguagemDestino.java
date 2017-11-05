package destino;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import classes.ListaMacros;
import parse.Compilador;

public class LinguagemDestino {
	
	public static void geraCodigoDestino(String nomeArquivoFonte){
		BufferedWriter arqSaida;
		try{
			arqSaida = new BufferedWriter(new FileWriter(nomeArquivoFonte + ".csl"));
            arqSaida.write("<?xml version='1.0' encoding='utf-8'?>\r\n");
            arqSaida.write("<style xmlns='http://purl.org/net/xbiblio/csl' version='1.0' class='in-text' default-locale='pt-BR'>\r\n");
            arqSaida.write("<info>\r\n");
            arqSaida.write("<title>Associação Brasileira de Normas Técnicas - Universidade Federal do Espírito Santo (Portuguese - Brazil)</title>\r\n");
            arqSaida.write("<title-short>ABNT-UFES</title-short>\r\n");
            arqSaida.write("<author>\r\n");
            arqSaida.write("<name>Gustavo Ramaldes Filocre</name>\r\n");
            arqSaida.write("<email>gustavoramaldes@gmail.com</email>\r\n");
            arqSaida.write("</author>\r\n");
            arqSaida.write("<category citation-format='author-date'/>\r\n");
            arqSaida.write("<category field='generic-base'/>\r\n");
            arqSaida.write("<summary>The strict Brazilian ABNT standard style author-date</summary>\r\n");
            arqSaida.write("<updated>2016-05-17T00:00:00-03:00</updated>\r\n");
            arqSaida.write("<rights license='http://creativecommons.org/licenses/by-sa/3.0/'>This work is licensed under a Creative Commons Attribution-ShareAlike 3.0 License</rights>\r\n");
            arqSaida.write("</info>\r\n");
            arqSaida.write("<locale xml:lang='pt-BR'>\r\n");
            arqSaida.write("<style-options punctuation-in-quote='false' limit-day-ordinals-to-day-1='true'/>\r\n");
            arqSaida.write("<terms>\r\n");
            arqSaida.write("<term name='editor' form='short'>\r\n");
            arqSaida.write("<single>org.</single>\r\n");
            arqSaida.write("<multiple>org.</multiple>\r\n");
            arqSaida.write("</term>\r\n");
            arqSaida.write("<term name='container-author' form='short'>\r\n");
            arqSaida.write("<single>org.</single>\r\n");
            arqSaida.write("<multiple>org.</multiple>\r\n");
            arqSaida.write("</term>\r\n");
            arqSaida.write("<term name='collection-editor' form='short'>\r\n");
            arqSaida.write("<single>org.</single>\r\n");
            arqSaida.write("<multiple>org.</multiple>\r\n");
            arqSaida.write("</term>\r\n");
            arqSaida.write("</terms>\r\n");
            arqSaida.write("</locale>\r\n");
            //Macros
            arqSaida.write(processaMacros(Compilador.macros));
            arqSaida.write("<citation et-al-min='4' et-al-use-first='1' et-al-subsequent-min='4' et-al-subsequent-use-first='1' collapse='year' disambiguate-add-year-suffix='true' disambiguate-add-names='true' disambiguate-add-givenname='true' givenname-disambiguation-rule='all-names'>\r\n");
            arqSaida.write("<sort>\r\n");
            arqSaida.write("<key macro='author'/>\r\n");
            arqSaida.write("<key variable='issued'/>\r\n");
            arqSaida.write("</sort>\r\n");
            arqSaida.write("<layout prefix='(' suffix=')' delimiter='; '>\r\n");
            arqSaida.write("<group>\r\n");
            arqSaida.write("<text suffix=', ' macro='author-short'/>\r\n");
            arqSaida.write("<text macro='issued-year'/>\r\n");
            arqSaida.write("<text prefix=', ' macro='citation-locator'/>\r\n");
            arqSaida.write("</group>\r\n");
            arqSaida.write("</layout>\r\n");
            arqSaida.write("</citation>\r\n");
            arqSaida.write("<bibliography hanging-indent='false' et-al-min='4' et-al-use-first='1' entry-spacing='1' subsequent-author-substitute='______' subsequent-author-substitute-rule='partial-each'>\r\n");
            //Tipos
            arqSaida.write("</bibliography>\r\n");
            arqSaida.write("</style>\r\n");
            arqSaida.close();
		}catch(IOException e){
			System.out.println("Problemas na geracao do codigo destino");
			System.exit(1);
		}catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
	}
	
	static String processaMacros(ListaMacros macros){
		return macros.codigoDestino();
	}
}
