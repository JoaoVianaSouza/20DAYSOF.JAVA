## 📄 Descrição do Projeto

Este projeto foi desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO) utilizando Java. O sistema permite criar e gerenciar objetos representando títulos (filmes e séries) e calcular o tempo total de visualização.

## 🗂️ Estrutura do Projeto

### 📚 Classes e Atributos

| Classe | Descrição |
|--------|------------|
| `Titulo` | Classe abstrata base para `Filme` e `Serie`, contendo atributos comuns |
| `Filme`  | Herda de `Titulo` e adiciona o atributo `diretor` |
| `Serie`  | Herda de `Titulo` e adiciona atributos específicos como `temporadas`, `ativa`, `episodiosPorTemporada` e `minutosPorEpisodio` |
| `CalculadoraDeTempo` | Classe independente para somar a duração de todos os títulos |

### 🔍 Conceitos de POO Utilizados

- **<span style="color: blue;">Classe</span>**: Uma estrutura que define um tipo de objeto, incluindo atributos (propriedades) e métodos (funções) que os objetos desse tipo terão. No projeto, `Titulo`, `Filme`, `Serie`, e `CalculadoraDeTempo` são exemplos de classes.
- **<span style="color: blue;">Objeto</span>**: Uma instância de uma classe. Por exemplo, `favorito` e `outro` são objetos da classe `Filme`.
- **<span style="color: blue;">Herança</span>**: As classes `Filme` e `Serie` herdam da classe `Titulo`, reutilizando e estendendo suas propriedades e métodos. Isso permite que `Filme` e `Serie` compartilhem código comum definido em `Titulo`.
- **<span style="color: blue;">Polimorfismo</span>**: Através do método abstrato `getDuracaoEmMinutos`, que é implementado de forma diferente nas classes `Filme` e `Serie`. Isso permite que objetos de diferentes classes sejam tratados de maneira uniforme.
- **<span style="color: blue;">Encapsulamento</span>**: Uso de métodos `get` e `set` para acessar e modificar os atributos privados das classes. Isso protege os dados e assegura que eles sejam manipulados de maneira controlada.
- **<span style="color: blue;">Abstração</span>**: A classe `Titulo` define a estrutura básica de um título, enquanto as subclasses (`Filme` e `Serie`) especificam comportamentos detalhados.

### 🎬 Exemplo de Uso

Ao executar o programa, você verá a saída com o tempo total calculado para os filmes e séries adicionados na classe `Main`:

### 🤝 Contribuições
Sinta-se à vontade para fazer um fork deste projeto e personaliza-lo da forma que achar melhor.

## 🌐 Conecte-se Comigo

Para mais informações ou para acompanhar meu trabalho, siga-me no [LinkedIn](https://www.linkedin.com/in/joao-pedro-gon%C3%A7alves-viana-de-souza-a33a84242/).

