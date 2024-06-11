package JoaoVianaSouza.screenmatch.service;

public interface IConverteDados {
    // O "T" é um tipo genérico, ou seja, não sei o que será devolvido, mas sei que algo será devolvido
    // Para falar o que eu quero ser devolvido, quando a classe for ser chamada isso será resolvido
    <T> T obterDados(String json, Class<T> classe);
}



