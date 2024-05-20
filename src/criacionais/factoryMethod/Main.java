package criacionais.factoryMethod;

import java.util.Scanner;

public class Main {
	
	private static Transporte transporte;

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Selecione a opcao desejada? [ 1 - uber confort , 2 - uber flash, 3 - uber eats ]");
			String opcao = sc.next();
			
			configure(opcao);
		}
		
		if(transporte != null) {
			iniciarViagem();
		}
	}
	
	private static void configure(String type) {
		
		switch(type) {
		
			case "1":
				transporte = new TransporteCarro();
				break;
			case "2":
				transporte = new TransporteMoto();
				break;
			case "3":
				transporte = new TransporteBicicleta();
				break;
			default: 
				System.out.println("Selecione uma opção valida");
		
		}
	}
	
	private static void iniciarViagem() {
		transporte.iniciarTransporte();
	}

}
