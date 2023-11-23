package lojaloja.apilojaloja.entidade;

import jakarta.persistence.*;

import lojaloja.apilojaloja.record.DtoUsuario;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endereco")
@Entity
@EqualsAndHashCode(of = "id")
public class Endereco {

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    @Column(name = "id")
    private Long id;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

    private String cep;

    private String complemento;


    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

}








