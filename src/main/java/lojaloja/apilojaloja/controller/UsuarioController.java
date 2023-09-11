package lojaloja.apilojaloja.controller;

import jakarta.transaction.Transactional;
import lojaloja.apilojaloja.entidade.Endereco;
import lojaloja.apilojaloja.entidade.Usuario;
import lojaloja.apilojaloja.record.UsuarioRecord;
import lojaloja.apilojaloja.repository.EnderecoRepository;
import lojaloja.apilojaloja.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lojaloja.apilojaloja.record.EnderecoRecord;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    EnderecoRepository enderecoRepository;

    @PostMapping
    @Transactional
    public void cadastrarUsuarios(@RequestBody UsuarioRecord x) {


        usuarioRepository.saveAndFlush(new Usuario(x));
        enderecoRepository.saveAndFlush(new Endereco(x));






    }


}




