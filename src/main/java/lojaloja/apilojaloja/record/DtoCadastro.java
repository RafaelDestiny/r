package lojaloja.apilojaloja.record;

public class DtoCadastro {

    private DtoUsuario dtoUsuario;
    private DtoEndereco dtoEndereco;

    public DtoUsuario getDtoUsuario() {
        return dtoUsuario;
    }

    public DtoEndereco getDtoEndereco() {
        return dtoEndereco;
    }

    public void setDtoUsuario(DtoUsuario dtoUsuario) {
        this.dtoUsuario = dtoUsuario;
    }

    public void setDtoEndereco(DtoEndereco dtoEndereco) {
        this.dtoEndereco = dtoEndereco;
    }


}
