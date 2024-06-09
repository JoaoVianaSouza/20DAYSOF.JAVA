# 📦 Projeto de Consulta de CEP com Java

## Descrição

Este projeto Java utiliza várias funcionalidades e bibliotecas importantes para realizar a consulta de CEP (Código de Endereçamento Postal) via API "VIA-CEP" e salvar os dados em um arquivo JSON. O projeto envolve o uso de Maven, tratamento de exceções, Gson para manipulação de JSON e integração com a API "VIA-CEP".

## Funcionalidades Utilizadas

### 🚀 Maven
Maven é uma ferramenta de automação de compilação usada principalmente para projetos Java. Ele fornece uma estrutura padrão para gerenciar dependências, compilar, testar e empacotar projetos Java.

#### Estrutura do Maven:
- `pom.xml`: Arquivo de configuração do Maven onde são definidas as dependências, plugins e outras configurações do projeto.
- `src/main/java`: Diretório que contém o código-fonte da aplicação.
- `src/test/java`: Diretório que contém os testes da aplicação.

### ⚠️ Exceções
Exceções são eventos que ocorrem durante a execução do programa e que interrompem o fluxo normal das instruções. Em Java, as exceções são tratadas usando os blocos `try-catch`. No projeto, são usados para:
- Tratar exceções de entrada/saída (`IOException`) durante a escrita do arquivo JSON.
- Garantir que erros, como divisões por zero, sejam manejados apropriadamente, exibindo mensagens de erro ao usuário.

### 📄 Gson
Gson é uma biblioteca Java usada para converter objetos Java em sua representação JSON e vice-versa. É útil para trabalhar com APIs que utilizam JSON como formato de dados.

#### Utilização:
- Importação da biblioteca Gson.
- Criação de um objeto Gson.
- Conversão de um objeto Java para JSON (`toJson`).
- Conversão de uma string JSON para um objeto Java (`fromJson`).

### 🌐 API "VIA-CEP"
A API "VIA-CEP" permite consultar informações sobre um endereço a partir de um CEP. É usada para obter dados como logradouro, complemento, bairro e localidade.

## Estrutura do Projeto

### 🏠 Modelos
O projeto possui um modelo `Endereco` que representa os dados de um endereço obtido via consulta à API.

### 🖥️ Main
A classe `Main` contém a lógica para interação com o usuário, consulta do CEP, tratamento de exceções e salvamento dos dados em um arquivo JSON.

## 🌐 Conecte-se comigo

Para saber mais sobre meus estudos e projetos em Java e POO, você pode me encontrar no [LinkedIn](https://www.linkedin.com/in/joao-pedro-gon%C3%A7alves-viana-de-souza-a33a84242/).
