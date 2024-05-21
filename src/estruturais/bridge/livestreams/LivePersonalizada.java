package estruturais.bridge.livestreams;

import estruturais.bridge.plataformas.IPlataforma;

public class LivePersonalizada extends Live {
	
	public LivePersonalizada(IPlataforma plataforma) {
		super.plataforma = plataforma;
	}
	
	public void legendas() {
		System.out.println("Legendas ativadas na transmissão!");
	}
	
	public void comentarios() {
		System.out.println("Comentarios habilitados na live!");
	}

}
