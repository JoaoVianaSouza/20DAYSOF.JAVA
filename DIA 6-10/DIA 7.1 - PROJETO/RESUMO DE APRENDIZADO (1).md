# Projeto de Estudo: Cartão de Crédito e Compras

Este projeto foi desenvolvido para estudar conceitos de programação em Java, como `Comparable`, `Collections.sort`, `LinkedList`, `ArrayList` e manipulação de listas. O projeto simula o uso de um cartão de crédito e registra compras realizadas, exibindo as compras em ordem de valor ao final.

## 📋 Funcionalidades

- Definição de limite e saldo do cartão de crédito.
- Registro de compras, verificando se o saldo é suficiente.
- Listagem das compras realizadas, ordenadas pelo valor.

## 📂 Estrutura do Projeto

O projeto consiste nas seguintes classes:

### `CartaoDeCredito`

Esta classe representa um cartão de crédito com um limite e saldo. Ela contém métodos para lançar uma compra e atualizar o saldo.

### `Compra`

Esta classe representa uma compra com descrição e valor. Ela implementa a interface `Comparable` para permitir a ordenação das compras pelo valor.

### `Main`

A classe `Main` contém o método principal que interage com o usuário para definir o limite do cartão, registrar compras e exibir as compras ordenadas pelo valor.

## 💡 Conceitos Aplicados

### 🏗️ Constructor
O **Constructor** é um método especial usado para inicializar objetos. No Java, o construtor é semelhante a um método, mas com algumas diferenças: ele tem o mesmo nome da classe e não tem um tipo de retorno. Nos projetos, foram utilizados construtores para inicializar os objetos das classes.

### 🔄 Comparable e compareTo
A interface **Comparable** permite definir a ordem natural dos objetos de uma classe. O método **compareTo** é usado para comparar objetos, neste caso, comparando o valor das compras para ordená-las.

### 🔄 Collections.sort
O método **Collections.sort** é usado para ordenar listas em Java. Foi utilizado para ordenar a lista de compras pelo valor.

### 🔄 ArrayList e LinkedList
**ArrayList** e **LinkedList** são duas implementações da interface List em Java. **ArrayList** é uma lista redimensionável que permite acesso rápido aos elementos, enquanto **LinkedList** é uma lista ligada que facilita inserções e remoções. No projeto, foi demonstrado como utilizar ambas as listas.

## 📝 Exemplo de Uso

1. O usuário define o limite do cartão de crédito.
2. O usuário registra várias compras, informando a descrição e o valor.
3. O programa verifica se há saldo suficiente para cada compra e registra se possível.
4. Ao final, o programa exibe todas as compras realizadas em ordem crescente de valor e o saldo restante no cartão.

## 📌 Como Executar

Para executar o projeto, compile as classes `CartaoDeCredito`, `Compra` e `Main`. Em seguida, execute a classe `Main` para interagir com o programa.

## 🌐 Conecte-se comigo

Para saber mais sobre meus estudos e projetos em Java e POO, você pode me encontrar no [LinkedIn](https://www.linkedin.com/in/joao-pedro-gon%C3%A7alves-viana-de-souza-a33a84242/).
