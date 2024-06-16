package screenmatch.modelos;

public class ErroDeConversaoDeAnoExeption extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExeption(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
