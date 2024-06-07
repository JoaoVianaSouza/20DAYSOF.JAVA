// Record é um cabeçalho sem muitas informações
// Definindo o que será passado nessa classe, que serão as informações do json:
// Ele irá pegar e escrever o campo "title", "year" e "runtime"
public record TituloOmdb(String title, String year, String runtime) {
}


