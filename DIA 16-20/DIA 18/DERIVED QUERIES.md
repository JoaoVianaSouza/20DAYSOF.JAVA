# Derived Queries JPA 📚✨

A JPA (Java Persistence API) oferece uma série de recursos poderosos para trabalhar com persistência de dados. Um dos mais úteis é o uso de *derived queries*, que nos permite realizar consultas personalizadas no banco de dados de maneira simples e eficaz. Vamos explorar o que são derived queries, seus pontos positivos e como utilizá-las.

## O que são Derived Queries? 🤔

As *derived queries* são métodos específicos criados na interface que herda de `JpaRepository`. Esses métodos utilizam palavras-chave (em inglês) para indicar o tipo de busca que queremos realizar. A estrutura básica de uma derived query na JPA é composta por:

### Verbos Introdutórios 🔍

- `find`, `read`, `query`, `count`, `get`

### Critérios de Busca 🔑

Os critérios de busca são variados e podem ser combinados de diferentes maneiras para atender às necessidades específicas da consulta. Vamos ver alguns exemplos práticos:

- `findByTitulo` - Busca por um atributo específico, neste caso, `titulo`.
- `findByTituloContainingIgnoreCase` - Busca por títulos que contenham um trecho específico, ignorando maiúsculas e minúsculas.

### Palavras-chave Comuns 📝

#### Relativas à Igualdade 
- `Is` - Igualdade
- `Equals` - Igualdade
- `IsNot` - Desigualdade
- `IsNull` - Verificar se é nulo

#### Relativas à Similaridade
- `Containing` - Contém um trecho
- `StartingWith` - Começa com um trecho
- `EndingWith` - Termina com um trecho

#### Relacionadas à Comparação
- `LessThan` - Menor que um valor
- `LessThanEqual` - Menor ou igual a um valor
- `GreaterThan` - Maior que um valor
- `GreaterThanEqual` - Maior ou igual a um valor
- `Between` - Entre dois valores

## Pontos Positivos das Derived Queries 🌟

1. **Facilidade de Uso**: A sintaxe é simples e direta, o que facilita a escrita e leitura das consultas.
2. **Produtividade**: Aumenta a produtividade do desenvolvedor, permitindo criar consultas complexas sem escrever SQL nativo.
3. **Manutenção**: Consultas declarativas são mais fáceis de manter e refatorar.
4. **Legibilidade**: O uso de palavras-chave claras e descritivas melhora a legibilidade do código.
5. **Integração**: Totalmente integrada ao Spring Data JPA, aproveitando todo o ecossistema Spring.

## Saber Mais 🔎

Acesse o site abaixo para saber mais sobre Derived Queries:

[Derived Queries](https://www.baeldung.com/spring-data-derived-queries)

