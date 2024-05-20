package criacionais.singleton;

public class Singleton {

	// Instância estática privada da classe
    private static Singleton instance;

    // Construtor privado para evitar instanciação direta
    private Singleton() {}

    // Método estático para retornar a instância única da classe
    public static Singleton getInstance() {
        // Se a instância ainda não foi criada, cria uma nova
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Métodos da instância
    public void showMessage() {
        System.out.println("Olá, Eu sou um Singleton!");
    }
    
}


