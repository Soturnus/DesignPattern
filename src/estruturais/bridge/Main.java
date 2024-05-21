package estruturais.bridge;

import estruturais.bridge.livestreams.Live;
import estruturais.bridge.livestreams.LivePersonalizada;
import estruturais.bridge.plataformas.IPlataforma;
import estruturais.bridge.plataformas.Youtube;

public class Main {

	public static void main(String[] args) {
		
		iniciarTransmissao(new Youtube());
//		System.out.println("\n");
//		iniciarTransmissao(new TwitchTV());
//		System.out.println("\n");
//		iniciarTransmissaoPersonalizada(new Facebook());

	}
	
	public static void iniciarTransmissao(IPlataforma plataforma) {
		
		System.out.println("Iniciando a transmissão... aguarde");	
		
		Live live = new Live(plataforma);
		live.broadcasting();
		live.resultado();
		
	}
	
public static void iniciarTransmissaoPersonalizada(IPlataforma plataforma) {
		
		System.out.println("Iniciando a transmissão... aguarde");	
		
		LivePersonalizada live = new LivePersonalizada(plataforma);
		live.broadcasting();
		live.comentarios();
		live.legendas();
		live.resultado();
		
	}
	
	

}
