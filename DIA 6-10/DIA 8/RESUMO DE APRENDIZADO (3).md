# 🔗 Consumindo API com Java

Este projeto foi desenvolvido para estudar como consumir APIs usando Java. Ele permite que o usuário busque informações sobre um filme através da API OMDB (Open Movie Database) e exibe os resultados no console. Além disso, o Postman foi utilizado para debugar e testar a API.

## 📋 Funcionalidades

- Permite ao usuário digitar o nome de um filme para buscar informações.
- Consome a API OMDB para obter dados do filme.
- Exibe as informações do filme no console.

## 📂 Estrutura do Projeto

O projeto consiste na seguinte classe:

### `Main`

A classe `Main` contém o método principal que:

1. Lê o nome do filme digitado pelo usuário.
2. Constrói a URL para a API OMDB com base no nome do filme.
3. Faz uma requisição HTTP para a API.
4. Exibe a resposta da API no console.

## 💡 Conceitos Aplicados

### 🔄 Consumindo APIs

Consumir uma API em Java envolve a utilização de classes como `HttpClient`, `HttpRequest`, e `HttpResponse`. No projeto, estas classes foram usadas para construir uma requisição HTTP, enviá-la e processar a resposta.

### 🛠️ Postman

O **Postman** é uma ferramenta popular para testar APIs. Ele permite enviar requisições HTTP a uma API, visualizar as respostas e depurar problemas. Durante o desenvolvimento deste projeto, o Postman foi usado para:

- Testar a API OMDB e verificar os formatos de resposta.
- Simular requisições HTTP antes de implementá-las no código Java.
- Garantir que a API estava respondendo corretamente antes de integrar a funcionalidade no programa Java.

## 📝 Exemplo de Uso

1. O usuário é solicitado a digitar o nome de um filme.
2. O programa constrói a URL da API OMDB com base no nome do filme.
3. O programa envia uma requisição HTTP GET para a API.
4. A resposta da API, contendo informações sobre o filme, é exibida no console.

## 🌐 Conecte-se comigo

Para saber mais sobre meus estudos e projetos em Java e POO, você pode me encontrar no [LinkedIn](https://www.linkedin.com/in/joao-pedro-gon%C3%A7alves-viana-de-souza-a33a84242/).
