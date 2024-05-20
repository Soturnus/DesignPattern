package criacionais.prototype;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		 // Criação do protótipo de documento
        Documento prototipoDocumento = new Documento("Documento1", 
										        	new Date(), 
										        	"Aqui temos um prototipo de Documento");

        // Criação do gerenciador de documentos com o protótipo
        GerenciadorDocumentos gerenciador = new GerenciadorDocumentos(prototipoDocumento);

        // Criação de um novo documento clonando o protótipo
        Documento novoDocumento = gerenciador.criarNovoDocumento("NovoDocumento 20/05");

        // Exibindo informações do novo documento
        System.out.println("Novo Documento - Nome: " + novoDocumento.getNome());
        System.out.println("Novo Documento - Data de Criação: " + novoDocumento.getDataCriacao());
        System.out.println("Novo Documento - Conteúdo: " + novoDocumento.getConteudo());
        
        // Criação do gerenciador de documentos com o protótipo
        GerenciadorDocumentos gerenciador2 = new GerenciadorDocumentos(prototipoDocumento);

        // Criação de um novo documento clonando o protótipo
        Documento novoDocumento2 = gerenciador2.criarNovoDocumento("Documento Clonado");
        
        System.out.println();
        System.out.println("Segundo Documento - Nome: " + novoDocumento2.getNome());
        System.out.println("Segundo Documento - Data de Criação: " + novoDocumento2.getDataCriacao());
        System.out.println("Segundo Documento - Conteúdo: " + novoDocumento2.getConteudo());
        
        
        
        
        

	}

}
