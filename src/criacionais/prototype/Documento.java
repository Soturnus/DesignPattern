package criacionais.prototype;

import java.util.Date;

//Classe Documento que atua como protótipo
public class Documento implements Cloneable {

	private String nome;
	private Date dataCriacao;
	private String conteudo;
	
	public Documento(String nome, Date dataCriacao, String conteudo) {
	    this.nome = nome;
	    this.dataCriacao = dataCriacao;
	    this.conteudo = conteudo;
	}
	
	// Método clone() é sobreescrito para permitir a clonagem do objeto
	@Override
	public Documento clone() throws CloneNotSupportedException {
	    return (Documento) super.clone();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
}