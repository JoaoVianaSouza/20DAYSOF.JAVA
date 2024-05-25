package screenmatch.modelos;

public abstract class Titulo { // Classe Título

    //Atributos
    private String nome;
    private int anoDeLancamento, duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private  int totalDeAvaliacoes;
    private double mediaAvaliacao;

    // Métodos
    public int getTotalDeAvaliacoes() { // O "Get" é utilizado para fazer com que o valor do atributo possa ser resgatado em outra classe
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) { // O "Set" é utilizado para fazer com que o valor do atributo possa ser mudado em outra classe
        this.nome = nome; // O "this." é usado para definir que o valor que será alterado será pertencente ao atributo nome
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) { // O "Set" é utilizado para fazer com que o valor do atributo possa ser mudado em outra classe
        this.incluidoNoPlano = incluidoNoPlano; // O "this." é usado para definir que o valor que será alterado será pertencente ao atributo nome
    }

    public void setAnoDeLancamento(int anoDeLancamento) { // O "Set" é utilizado para fazer com que o valor do atributo possa ser mudado em outra classe
        this.anoDeLancamento = anoDeLancamento; // O "this." é usado para definir que o valor que será alterado será pertencente ao atributo nome
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) { // O "Set" é utilizado para fazer com que o valor do atributo possa ser mudado em outra classe
        this.duracaoEmMinutos = duracaoEmMinutos; // O "this." é usado para definir que o valor que será alterado será pertencente ao atributo nome
    }

    public void exibeFichaTecnica(){ // Esse método é utilizado para que exiba, quando for chamado, as declarações abaixo
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);

    }

    public void avalia(double avaliacao){ // Esse método é utilizado para que exiba, quando for chamado, as declarações abaixo
        System.out.printf("\n Sua avaliação: %.2f \n", avaliacao); // Irá exibir na tela a avaliação que for setada
        somaDasAvaliacoes += avaliacao; // A cada avaliação inserida, ela será somada na variavel "somaDasAvaliações"
        totalDeAvaliacoes ++; // A cada avaliação inserida, irá ser incrementado o número de avaliações
    }

    public void pegaMedia(){ // Esse método será usado para exibir a media de avaliações
        mediaAvaliacao = (somaDasAvaliacoes/totalDeAvaliacoes); // Essa variável vai armazenar o calculo da media de avaliações
        System.out.println("A média das avaliações é: " + mediaAvaliacao); // Exibir a media de avaliações para o usuário
    }

    public abstract int getDuracaoEmMinutos(); // Definindo uma classe que só poderá ser herdada, ela não pode ser instanciada diretamente
}

