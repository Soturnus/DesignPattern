package estruturais.bridge.plataformas;

public class TwitchTV implements IPlataforma {

	public TwitchTV() {
		configureRMTP();
		System.out.println("TwitchTV: Transmissão iniciada!");
	}

	@Override
	public void configureRMTP() {
		authToken();
		System.out.println("TwitchTV: Conta autorizada e configurada.");
		
	}

	@Override
	public void authToken() {
		System.out.println("TwitchTV: Autorizando aplicação");
		
	}

}