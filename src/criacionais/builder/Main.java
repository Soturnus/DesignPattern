package criacionais.builder;

import criacionais.builder.builders.BuilderCarro;
import criacionais.builder.carros.Carro;
import criacionais.builder.diretor.Diretor;

public class Main {

	public static void main(String[] args) {

		Diretor diretor = new Diretor();
		
		//Criando carro
		BuilderCarro builder = new BuilderCarro();
		diretor.contruirCarroSedan(builder);
		
		Carro carro = builder.getResultado();
		System.out.println(carro.getTipoCarro() + " produzido com sucesso!");
		
		//Criando Caminhonete
		
//		BuilderCaminhonete caminhoneteBuilder = new BuilderCaminhonete();
//		diretor.contruirCaminhonete(caminhoneteBuilder);
//		
//		Caminhonete caminhonete = caminhoneteBuilder.getResultado();
//		System.out.println("Caminhão: " + caminhonete.resultado());		

	}

}
