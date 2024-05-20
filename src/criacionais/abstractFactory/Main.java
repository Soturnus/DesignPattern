package criacionais.abstractFactory;

import criacionais.abstractFactory.app.Application;
import criacionais.abstractFactory.factories.ITransporteFactory;
import criacionais.abstractFactory.factories.InDriveTransporte;
import criacionais.abstractFactory.factories.UberTransporte;

public class Main {
	
	public static Application configureApplication() {
		
		Application app;
		ITransporteFactory factory;
		
		String empresa = "uber";
		
		if(empresa == "uber") {
			factory = new UberTransporte();
		} else {
			factory = new InDriveTransporte();
		}
		
		app = new Application(factory);
		
		return app;
	}

	public static void main(String[] args) {
		
		Application app = configureApplication();
		app.iniciarRota();

	}

}
