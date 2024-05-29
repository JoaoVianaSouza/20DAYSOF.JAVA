# 📚 Exercícios de Programação Orientada a Objetos (POO)

## 📄 Descrição do Projeto

Este projeto contém uma série de exercícios de POO em Java, abordando conceitos como interfaces, implementação de métodos, cálculos diversos e condicionais. Cada exercício visa praticar e consolidar conhecimentos sobre classes, interfaces e métodos em Java.

## 🗂️ Estrutura do Projeto

### 📚 Classes e Interfaces

| Tipo        | Nome                         | Descrição                                                                                 |
|-------------|------------------------------|-------------------------------------------------------------------------------------------|
| **Interface**   | `ConversaoFinanceira`        | Define o método `converterDolarParaReal` para conversão de dólares para reais.            |
| **Classe**      | `ConversorMoeda`             | Implementa a interface `ConversaoFinanceira` para conversão de dólares para reais.        |
| **Interface**   | `CalculoGeometrico`          | Define os métodos `calcularArea` e `calcularPerimetro` para cálculos geométricos.         |
| **Classe**      | `CalculadoraSalaRetangular`  | Implementa a interface `CalculoGeometrico` para calcular a área e o perímetro de uma sala retangular. |
| **Interface**   | `Tabuada`                    | Define o método `mostrarTabuada` para exibir a tabuada de um número.                      |
| **Classe**      | `TabuadaMultiplicacao`       | Implementa a interface `Tabuada` para exibir a tabuada de um número usando um loop for.   |
| **Interface**   | `ConversorTemperatura`       | Define os métodos `celsiusParaFahrenheit` e `fahrenheitParaCelsius` para conversão de temperatura. |
| **Classe**      | `ConversorTemperaturaPadrao` | Implementa a interface `ConversorTemperatura` com as fórmulas de conversão de temperatura.|
| **Interface**   | `Calculavel`                 | Define o método `calcularPrecoFinal` para cálculo de preços finais.                       |
| **Classe**      | `Livro`                      | Implementa a interface `Calculavel` para calcular o preço final de um livro considerando descontos ou taxas adicionais. |

### 🔍 Conceitos de POO Utilizados

- **<span style="color: blue;">Classe</span>**: Estrutura que define um tipo de objeto, incluindo atributos e métodos. Exemplos: `ConversorMoeda`, `CalculadoraSalaRetangular`, `TabuadaMultiplicacao`, `ConversorTemperaturaPadrao`, `Livro`.
- **<span style="color: blue;">Interface</span>**: Estrutura que define métodos que devem ser implementados por classes. Exemplos: `ConversaoFinanceira`, `CalculoGeometrico`, `Tabuada`, `ConversorTemperatura`, `Calculavel`.
- **<span style="color: blue;">Objeto</span>**: Instância de uma classe. Por exemplo, um objeto da classe `ConversorMoeda` pode ser usado para converter valores de dólar para real.
- **<span style="color: blue;">Implementação</span>**: As classes que implementam interfaces devem fornecer corpos de método para todos os métodos definidos na interface. Exemplo: `ConversorMoeda` implementa `ConversaoFinanceira` e fornece a implementação para `converterDolarParaReal`.
- **<span style="color: blue;">Encapsulamento</span>**: Proteção dos dados dentro das classes, acessíveis somente por métodos públicos definidos. Exemplos: métodos `calcularArea` e `calcularPerimetro` em `CalculadoraSalaRetangular`.
- **<span style="color: blue;">Abstração</span>**: Simplificação de conceitos complexos por meio de interfaces e classes abstratas. Exemplo: a interface `ConversorTemperatura` define métodos de conversão sem especificar os detalhes da implementação.
  
**Características das Interfaces:**
1. Não podem conter implementação de métodos, apenas assinaturas (a menos que sejam métodos padrão ou estáticos em versões mais recentes do Java).
2. As classes que implementam uma interface devem fornecer implementações para todos os métodos da interface.
3. Permitem a implementação múltipla, ou seja, uma classe pode implementar várias interfaces.
4. Utilizadas para promover a reutilização de código e a flexibilidade do software, pois permitem que diferentes classes implementem a mesma interface de maneiras diferentes.

### 🤝 Contribuições
Sinta-se à vontade para fazer um fork deste projeto e personaliza-lo da forma que achar melhor.

## 🌐 Conecte-se Comigo

Para mais informações ou para acompanhar meu trabalho, siga-me no [LinkedIn](https://www.linkedin.com/in/joao-pedro-gon%C3%A7alves-viana-de-souza-a33a84242/).


