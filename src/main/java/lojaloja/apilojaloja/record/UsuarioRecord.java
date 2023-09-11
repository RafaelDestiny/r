package lojaloja.apilojaloja.record;


import lojaloja.apilojaloja.entidade.Endereco;
import lojaloja.apilojaloja.entidade.Usuario;

public record UsuarioRecord(Long id,

                            String nome,
                            String sobreNome,
                            String dataDeCriacao,
                            String numeroCelular,
                            String email,



                            EnderecoRecord endereco){



}
