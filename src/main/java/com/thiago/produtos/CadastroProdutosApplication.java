package com.thiago.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.thiago.produtos")
@EntityScan("com.thiago.produtos.model") // Inclua o pacote da entidade aqui
@EnableJpaRepositories(basePackages = "com.thiago.produtos.repository")
public class CadastroProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroProdutosApplication.class, args);
	}

}
