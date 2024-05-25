package screenmatch.modelos;

public class Filme extends Titulo { // A classe "Filme" é um "EXTENDS" da classe "Titulo", ou seja, ela vai herdar todos os atributos da classe Titulo

    // Definindo atributos específicos desse objeto
    private String diretor;

    public String getDiretor() { // O "Get" é utilizado para fazer com que o valor do atributo possa ser resgatado em outra classe
        return this.diretor;
    }

    public void setDiretor(String diretor) { // O "Set" é utilizado para fazer com que o valor do atributo possa ser mudado em outra classe
        this.diretor = diretor;
    }

    @Override // Sobeescrevendo um método /atributo presente na classe mãe desse objeto
    public int getDuracaoEmMinutos() { // Definindo que a duração em minutos não vai retornar nenhum valor
        return 0;
    }
}


