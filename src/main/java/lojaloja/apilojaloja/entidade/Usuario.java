package lojaloja.apilojaloja.entidade;

import jakarta.persistence.*;

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

    @Column(name = "sobre_Nome")
    private String sobreNome;
    @Column(name = "data_De_Criacao")
    private String dataDeCriacao;

    private String numero;

    private String email;



    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Endereco endereco;








}
