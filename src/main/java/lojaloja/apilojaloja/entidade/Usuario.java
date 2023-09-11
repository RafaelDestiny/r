package lojaloja.apilojaloja.entidade;

import jakarta.persistence.*;
import lojaloja.apilojaloja.record.EnderecoRecord;
import lojaloja.apilojaloja.record.UsuarioRecord;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String nome;
    private String sobreNome;
    private String dataDeCriacao;
    private String numeroCelular;
    private String email;
    @OneToOne( mappedBy = "usuarioId", cascade = CascadeType.PERSIST)
    private Endereco endereco;






    public Usuario(UsuarioRecord x) {

        this.id = x.id();
        this.nome = x.nome();
        this.sobreNome = x.sobreNome();
        this.dataDeCriacao = x.dataDeCriacao();
        this.numeroCelular = x.numeroCelular();
        this.email = x.email();
        this.endereco = new Endereco(x.endereco());


    }

    public void setEndereco(Endereco endereco) {


        this.endereco = endereco;
    }

    public Endereco getEndereco() {


        return endereco;
    }

    public void setId(Long id) {


        this.id = id;
    }





}
