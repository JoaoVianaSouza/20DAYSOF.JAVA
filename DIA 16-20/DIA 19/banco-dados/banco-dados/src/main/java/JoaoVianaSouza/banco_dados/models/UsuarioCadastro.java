package JoaoVianaSouza.banco_dados.models;

import jakarta.persistence.*;
import org.springframework.dao.DataIntegrityViolationException;

import java.time.LocalDate;

// Anotação indicando que esta classe é uma entidade JPA que será mapeada para uma tabela no banco de dados
@Entity
// Especifica o nome da tabela no banco de dados
@Table(name = "cadastros")
public class UsuarioCadastro {

    // Indica que este campo é a chave primária da tabela
    @Id
    // Define que o valor do campo será gerado automaticamente pelo banco de dados
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private LocalDate dataNascimento;
    // Define que o campo CPF será único na tabela
    @Column(unique = true)
    private String cpf;

    // Indicando que o genero é um enum
    @Enumerated(EnumType.STRING)
    private Estado estado;

    // Declaração de outros campos da tabela
    private String cidadeNatal;
    private String nome;

    // Método getter para o campo id
    public Long getId() {
        return id;
    }

    // Método setter para o campo id
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método getter para o campo cpf
    public String getCpf() {
        return cpf;
    }


    // Método setter para o campo cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    // Método getter para o campo nome
    public String getNome() {
        return nome;
    }

    // Método setter para o campo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // Método para representar a entidade como uma string

    @Override
    public String toString() {
        return "UsuarioCadastro{" +
                "id=" + id +
                ", dataNascimento=" + dataNascimento +
                ", cpf='" + cpf + '\'' +
                ", estado=" + estado +
                ", cidadeNatal='" + cidadeNatal + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}



