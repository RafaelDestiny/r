package lojaloja.apilojaloja.record;

import lojaloja.apilojaloja.entidade.Usuario;

public record EnderecoRecord(Usuario usuarioId,
                             String cep,
                             String estado,
                             String cidade,
                             String bairro,
                             String rua,
                             String numero,
                             String complemento) {
}
