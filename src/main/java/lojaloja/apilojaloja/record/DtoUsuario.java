package lojaloja.apilojaloja.record;

public class DtoUsuario {

                         private Long id;
                         private String nome;
                         private String sobreNome;
                         private String dataDeCriacao;
                         private  String numero;
                         private  String email;
                         private   DtoEndereco endereco;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public DtoEndereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public void setNumeroCelular(String numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(DtoEndereco endereco) {
        this.endereco = endereco;
    }
}


