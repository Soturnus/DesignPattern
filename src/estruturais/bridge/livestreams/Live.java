package estruturais.bridge.livestreams;

import estruturais.bridge.plataformas.IPlataforma;

public class Live implements ILivestreams {
	
	protected IPlataforma plataforma;
	
	public Live() {
		
	}
	
	public Live(IPlataforma plataforma) {
		this.plataforma = plataforma;
	}
	

	@Override
	public void broadcasting() {
		System.out.println("Iniciando a transmissão!");
		
	}

	@Override
	public void resultado() {
		System.out.println("********* Ao Vivo *********");
		
	}

}
