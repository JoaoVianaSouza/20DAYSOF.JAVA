# Projeto Banco de Dados com Spring Boot e PostgreSQL 🛠️🔍

Este projeto envolve o desenvolvimento de uma aplicação simples utilizando Spring Boot para interagir com um banco de dados PostgreSQL. A aplicação permite cadastrar usuários com nome, CPF e cidade natal, armazenando esses dados na tabela "Cadastro".

## Tecnologias Utilizadas 🚀

- **Spring Boot**: Framework para criação de aplicações Java.
- **Spring Data JPA**: Facilita o acesso e a persistência de dados em bancos de dados relacionais com o uso de Hibernate.
- **PostgreSQL**: Banco de dados relacional utilizado para armazenar os dados dos usuários.

## Anotações "@" Utilizadas 📝

| Anotação | Utilização | Descrição |
| --- | --- | --- |
| @Entity | Aplicada na classe `UsuarioCadastro`. | Indica que a classe é uma entidade JPA que será mapeada para uma tabela no banco de dados. |
| @Table | Aplicada na classe `UsuarioCadastro`. | Especifica o nome da tabela no banco de dados que será mapeada pela entidade. |
| @Id | Aplicada no campo `id` da classe `UsuarioCadastro`. | Indica que este campo é a chave primária da tabela. |
| @GeneratedValue | Aplicada no campo `id` da classe `UsuarioCadastro`. | Define a estratégia de geração automática do valor do campo pelo banco de dados. |
| @Column | Aplicada no campo `cpf` da classe `UsuarioCadastro`. | Define as propriedades da coluna no banco de dados, como unicidade neste caso. |
| @SpringBootApplication | Aplicada na classe `BancoDadosApplication`. | Marca a classe como a classe principal do Spring Boot, responsável pela inicialização da aplicação. |
| @Autowired | Aplicada no campo `repositorio` da classe `BancoDadosApplication`. | Realiza a injeção de dependência do `CadastroRepository` automaticamente pelo Spring. |

## PostgreSQL 🐘

O PostgreSQL é um sistema de gerenciamento de banco de dados relacional robusto e de código aberto. Neste projeto, utilizamos o PostgreSQL para persistir os dados dos usuários cadastrados na tabela "Cadastro".

Para mais informações sobre como configurar a conexão com PostgreSQL, consulte a [documentação oficial do JDBC PostgreSQL](https://jdbc.postgresql.org/documentation/).

## Executando a Aplicação ▶️

Para executar a aplicação, certifique-se de ter o PostgreSQL instalado e configurado com as propriedades específicas no arquivo `application.properties`. Em seguida, execute a classe `BancoDadosApplication` como uma aplicação Java.

## 🌐 Conecte-se Comigo

Para mais informações ou para acompanhar meu trabalho, siga-me no [LinkedIn](https://www.linkedin.com/in/seu-perfil-linkedin).
