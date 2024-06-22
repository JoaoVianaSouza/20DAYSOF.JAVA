# ScreenMatch - Desenvolvido durante a formação Java + Spring Boot da Alura 🎬

Bem-vindo ao ScreenMatch, uma aplicação Java + Spring Web que permite aos usuários acessar informações sobre filmes, filtrar por categoria e listar temporadas e episódios de séries. Esta é uma aplicação fullstack que utiliza o frontend disponível no repositório [alura-cursos/3356-java-web-front](https://github.com/alura-cursos/3356-java-web-front) para fornecer uma interface amigável e moderna. 📽️

## Tecnologias Utilizadas 🛠️

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **HTML, CSS, JavaScript**
- **MySQL**

## Funcionalidades 🚀

- Cadastro e listagem de séries
- Filtragem de séries por categoria
- Listagem de temporadas e episódios
- Interface web interativa e responsiva

## Configuração do Projeto ⚙️

### Dependências

O projeto utiliza Maven para gerenciar as dependências. Certifique-se de ter o Maven instalado e configure o arquivo `pom.xml` com as dependências necessárias.

### Configuração do Banco de Dados

Configure as propriedades do banco de dados no arquivo `application.properties` para conectar-se ao seu banco de dados MySQL.

### Inicialização do Projeto

Para iniciar a aplicação, utilize o comando do Maven para rodar a aplicação Spring Boot. A aplicação estará disponível em `http://localhost:8080`.

## Estrutura do Projeto 📂

### Configuração de CORS

Para permitir requisições de diferentes origens, configuramos o CORS para aceitar requisições do frontend.

### Controladores

Os controladores são responsáveis por manejar as requisições HTTP e interagir com os serviços da aplicação para fornecer os dados necessários ao frontend.

### DTOs

Os DTOs (Data Transfer Objects) são usados para transferir dados entre as camadas da aplicação de forma eficiente e segura.

## Requisições, Portas e Servidores 🌐

A aplicação utiliza o Spring Boot para facilitar a criação de aplicações web robustas. O servidor embutido Tomcat é utilizado para gerenciar as requisições HTTP, que por padrão são atendidas na porta `8080`. A configuração de CORS permite que o frontend (executado em `http://127.0.0.1:5500`) interaja com a API sem problemas de origem cruzada.

## Frontend 🌟

A interface do usuário foi desenvolvida utilizando HTML, CSS e JavaScript, disponível em [alura-cursos/3356-java-web-front](https://github.com/alura-cursos/3356-java-web-front).

## Conclusão do Curso da Alura 🎓

Este projeto foi desenvolvido e concluído durante o curso da Alura, que forneceu uma base sólida em desenvolvimento web com Java e Spring. 

## 🌐 Conecte-se comigo

Para saber mais sobre meus estudos e projetos em Java e POO, você pode me encontrar no [LinkedIn](https://www.linkedin.com/in/joao-pedro-gon%C3%A7alves-viana-de-souza-a33a84242/).

![Java](https://img.icons8.com/color/48/000000/java-coffee-cup-logo--v1.png) ![Spring](https://img.icons8.com/color/48/000000/spring-logo.png)
