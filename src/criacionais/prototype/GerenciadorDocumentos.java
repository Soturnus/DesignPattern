package criacionais.prototype;

import java.util.Date;

//Classe GerenciadorDocumentos que permite criar novos documentos a partir do prototipo
public class GerenciadorDocumentos {
	
	 private Documento prototipo;
	
	 public GerenciadorDocumentos(Documento prototipo) {
	     this.prototipo = prototipo;
	 }
	
	 // Método para criar um novo documento clonando o prototipo
	 public Documento criarNovoDocumento(String nome) {
	     try {
	         Documento novoDocumento = prototipo.clone();
	         novoDocumento.setNome(nome);
	         novoDocumento.setDataCriacao(new Date());
	         return novoDocumento;
	     } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	         return null;
	     }
	 }
}