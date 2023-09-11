package lojaloja.apilojaloja.entidade;

import jakarta.persistence.*;
import lojaloja.apilojaloja.record.EnderecoRecord;
import lojaloja.apilojaloja.record.UsuarioRecord;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endereco")
@Entity
public class Endereco {

    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    @Id

    private Long id;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

    private String cep;

    private String complemento;
    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id" )
    private Usuario usuarioId;


    public Endereco(UsuarioRecord z){

        this.usuarioId.setId(z.id());


   }


    public Endereco(EnderecoRecord y){
        this.usuarioId = y.usuarioId();
        this.cep = y.cep();
        this.cidade = y.cidade();
        this.estado = y.estado();
        this.bairro = y.bairro();
        this.rua = y.rua();
        this.numero = y.numero();
        this.complemento = y.complemento();


    }



}
