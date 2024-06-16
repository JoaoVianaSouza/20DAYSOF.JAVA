package JoaoVianaSouza.banco_dados.principal;

import JoaoVianaSouza.banco_dados.models.UsuarioCadastro;
import JoaoVianaSouza.banco_dados.repository.CadastroRepository;
import java.util.Scanner;

public class Principal extends UsuarioCadastro {
    // Cria uma instância da entidade UsuarioCadastro
    UsuarioCadastro usuario = new UsuarioCadastro();

    // Scanner para ler dados de entrada do usuário
    Scanner leitura = new Scanner(System.in);

    // Repositório para acessar os métodos do banco de dados
    private CadastroRepository repositorio;

    // Construtor que inicializa o repositório
    public Principal(CadastroRepository repositorio) {
        this.repositorio = repositorio;
    }

    // Método que exibe o menu e salva os dados no banco de dados
    public void menu(){
        // Solicita o nome do usuário
        System.out.println("Digite o nome do usuário: ");
        var nome = leitura.nextLine();
        usuario.setNome(nome);
        // Salva no repositório
        repositorio.save(usuario);

        // Solicita o CPF do usuário
        System.out.println("Digite o CPF: ");
        var cpf = leitura.nextLine();
        usuario.setCpf(cpf);
        // Salva no repositório
        repositorio.save(usuario);

        // Solicita a cidade natal do usuário
        System.out.println("Digite a cidade natal: ");
        var cidade = leitura.nextLine();
        usuario.setCidadeNatal(cidade);
        // Salva no repositório
        repositorio.save(usuario);
    }
}
