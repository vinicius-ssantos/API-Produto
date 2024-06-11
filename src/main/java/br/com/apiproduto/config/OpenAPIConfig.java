package br.com.apiproduto.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //  indica que a classe é uma classe de configuração e o spring irá gerenciar os beans dessa classe
public class OpenAPIConfig {
    @Bean
    public OpenAPI customOpenAPI() { // método que retorna um objeto do tipo OpenAPI que é uma classe do Swagger que representa a documentação da API
        // Configuração do OpenAPI
        return new OpenAPI() // instanciando o OpenAPI e configurando as informações para a documentação
                .info(
                        new Info()  // informações sobre a API
                                .title("API PRODUTO") // título da API
                                .description("API de produtos na cloud") // descrição da API
                                .version("1.0.0") // versão da API
                );
    }
}
