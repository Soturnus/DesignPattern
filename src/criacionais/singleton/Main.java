package criacionais.singleton;

public class Main {

	public static void main(String[] args) {
		
		 // Obtenha a instância Singleton
        Singleton singleton = Singleton.getInstance();
        // Chame o método showMessage
        singleton.showMessage();
        

	}
}
