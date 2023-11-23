package lojaloja.apilojaloja.controller;

import jakarta.persistence.JoinColumn;
import lojaloja.apilojaloja.entidade.Endereco;
import lojaloja.apilojaloja.entidade.Usuario;
import lojaloja.apilojaloja.record.DtoCadastro;

import lojaloja.apilojaloja.repository.EnderecoRepository;
import lojaloja.apilojaloja.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired

    UsuarioRepository usuarioRepository;
    @Autowired
    EnderecoRepository enderecoRepository;

    @PostMapping
    @Transactional
    public void cadastrarUsuarios(@RequestBody DtoCadastro x) {


       Usuario usuario = new Usuario();



       usuario.setNome(x.getDtoUsuario().getNome());
       usuario.setSobreNome(x.getDtoUsuario().getSobreNome());
       usuario.setDataDeCriacao(x.getDtoUsuario().getDataDeCriacao());
       usuario.setEmail(x.getDtoUsuario().getEmail());
       usuario.setNumero(x.getDtoUsuario().getNumero());

       usuarioRepository.save(usuario);




       Endereco endereco = new Endereco();







       endereco.setRua(x.getDtoEndereco().getRua());
       endereco.setCep(x.getDtoEndereco().getCep());
       endereco.setCidade(x.getDtoEndereco().getCidade());
       endereco.setBairro(x.getDtoEndereco().getBairro());
       endereco.setEstado(x.getDtoEndereco().getEstado());
       endereco.setNumero(x.getDtoEndereco().getNumero());
       endereco.setComplemento(x.getDtoEndereco().getComplemento());

       enderecoRepository.save(endereco);



    }



}




