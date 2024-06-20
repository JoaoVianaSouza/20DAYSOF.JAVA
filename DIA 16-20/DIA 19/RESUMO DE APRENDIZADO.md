# Projeto de Banco de Dados com Spring Boot 🌐

*Hoje estudei sobre fazer requisição de queries no Java JPA utilizando JPQL. Adicionei uma nova funcionalidade no projeto para realizar consultas ao banco de dados de forma personalizada.*

## Descrição do Projeto ℹ️

Este projeto utiliza Java com Spring Boot e JPA para criar uma aplicação de cadastro de usuários. A aplicação permite realizar operações de CRUD (Create, Read, Update, Delete) e consultas personalizadas utilizando JPQL.

## Funcionalidades 🚀

- Cadastro de novos usuários com nome, data de nascimento, CPF, cidade natal e estado.
- Busca de usuários por CPF, estado e ano de nascimento utilizando Derived Queries.
- Consultas personalizadas utilizando JPQL para buscar usuários por ano de nascimento.

## Derived Queries 🔍

As Derived Queries são consultas automáticas que o Spring Data JPA cria com base nos nomes dos métodos dos repositórios. Exemplos de métodos incluem `findByCpfContainingIgnoreCase` e `findByEstado`.

## JPQL 📝

JPQL (Java Persistence Query Language) é uma linguagem de consulta orientada a objetos que é usada para definir consultas no Spring Data JPA. Ela permite escrever consultas SQL independentes de banco de dados e orientadas a objetos.

## Como Usar? 🛠️

Para utilizar as funcionalidades deste projeto, siga os passos abaixo:

1. Clone o repositório para sua máquina local.
2. Importe o projeto em sua IDE favorita.
3. Preencha o arquivo `application.properties` com as informações do seu banco de dados Postgree
4. Execute a aplicação Spring Boot.
5. Utilize as APIs REST ou o console para interagir com as funcionalidades de cadastro e consulta.

## Tecnologias Utilizadas 🛡️

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## 🌐 Conecte-se comigo

Para saber mais sobre meus estudos e projetos em Java e POO, você pode me encontrar no [LinkedIn](https://www.linkedin.com/in/joao-pedro-gon%C3%A7alves-viana-de-souza-a33a84242/).
