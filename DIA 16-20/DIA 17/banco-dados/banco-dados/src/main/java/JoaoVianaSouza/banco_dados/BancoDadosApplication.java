package JoaoVianaSouza.banco_dados;

import JoaoVianaSouza.banco_dados.principal.Principal;
import JoaoVianaSouza.banco_dados.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BancoDadosApplication implements CommandLineRunner {

	@Autowired
	private CadastroRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(BancoDadosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.menu();
	}
}
