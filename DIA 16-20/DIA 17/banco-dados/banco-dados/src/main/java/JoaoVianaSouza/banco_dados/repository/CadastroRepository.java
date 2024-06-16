package JoaoVianaSouza.banco_dados.repository;

import JoaoVianaSouza.banco_dados.models.UsuarioCadastro;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface que estende JpaRepository para fornecer operações CRUD para a entidade UsuarioCadastro
public interface CadastroRepository extends JpaRepository<UsuarioCadastro, Long> {
}
