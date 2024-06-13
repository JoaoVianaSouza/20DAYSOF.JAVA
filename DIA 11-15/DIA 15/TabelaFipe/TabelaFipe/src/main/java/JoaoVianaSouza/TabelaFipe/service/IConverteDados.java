package JoaoVianaSouza.TabelaFipe.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface IConverteDados {

    // O <T> é usado quando não queremos especificar o tipo passado
    <T> T obterDados(String json, Class<T> classe);

    <T> List<T> obterLista(String json, Class<T> classe);
}


