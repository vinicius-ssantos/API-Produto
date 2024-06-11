# Projeto API Produto

Este projeto é uma API RESTful para gerenciamento de produtos. Ele foi desenvolvido usando Java e Spring Boot, com Maven para gerenciamento de dependências.

## Tecnologias e Ferramentas

- **Java 11**: Linguagem de programação usada para desenvolver o projeto.
- **Spring Boot**: Framework usado para facilitar o desenvolvimento de aplicações Spring.
- **Spring Data JPA**: Usado para persistência de dados e facilitar a interação com o banco de dados.
- **H2 Database**: Banco de dados em memória usado para desenvolvimento e testes.
- **MySQL Connector**: Driver JDBC para conexão com o banco de dados MySQL em produção.
- **Lombok**: Biblioteca Java que ajuda a reduzir a verbosidade do código.
- **Springdoc OpenAPI UI**: Dependência usada para documentação da API usando o Swagger UI e o OpenAPI 3.

## Padrões de Projeto

- **MVC (Model-View-Controller)**: Este projeto segue o padrão MVC. Os `Controllers` lidam com as requisições HTTP, os `Services` contêm a lógica de negócios e os `Repositories` lidam com a persistência de dados.
- **DAO (Data Access Object)**: Os `Repositories` neste projeto seguem o padrão DAO, abstraindo e encapsulando todos os acessos ao banco de dados.
- **DTO (Data Transfer Object)**: Embora não mostrado nos trechos de código fornecidos, este projeto pode usar o padrão DTO para transferir dados entre processos ou computadores para reduzir o número de chamadas de método.
- **Injeção de Dependência**: Este projeto usa a injeção de dependência do Spring Framework para melhor modularidade e flexibilidade.

## Estrutura do Projeto

- `src/main/java/br/com/apiproduto`: Diretório raiz do projeto.
    - `ApiprodutoApplication.java`: Classe principal que inicia a aplicação.
    - `/entity`: Contém as classes de entidade que representam as tabelas do banco de dados.
    - `/repository`: Contém as interfaces do repositório que estendem o JpaRepository para realizar operações CRUD.
    - `/service`: Contém as interfaces de serviço que declaram métodos para a lógica de negócios.
    - `/service/impl`: Contém as classes de implementação do serviço que implementam as interfaces de serviço.
    - `/controller`: Contém as classes de controlador que lidam com as requisições HTTP.

## Como Executar

Para executar este projeto localmente, você precisa ter o Java 11 e o Maven instalados em sua máquina. Depois de clonar o projeto, você pode executá-lo usando o comando `mvn spring-boot:run` no diretório raiz do projeto.