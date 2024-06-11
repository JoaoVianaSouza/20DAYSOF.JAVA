package JoaoVianaSouza.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// JsonAlias: Notação que serve para ler o json e saber a qual atributo estou me referindo
// JsonProperty: Notação que faz a mesma coisa que o Alias mas, quando for devolver o json, ele também trás com o nome setado entre aspas

// Ignorar as propriedades que não foram mapeadas
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {


}


