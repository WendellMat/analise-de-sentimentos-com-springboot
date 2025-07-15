package br.ufpb.dcx.projeto_analise_de_sentimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal responsável por iniciar a aplicação Spring Boot.
 */
@SpringBootApplication // Anotação que habilita a configuração automática do Spring Boot
public class ProjetoAnaliseDeSentimentoApplication {

	/**
 	* Método principal que inicia a aplicação Spring Boot.
 	*/
	public static void main(String[] args) {
		SpringApplication.run(ProjetoAnaliseDeSentimentoApplication.class, args);
	}

}
