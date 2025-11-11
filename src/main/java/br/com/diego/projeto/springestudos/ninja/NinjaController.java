package br.com.diego.projeto.springestudos.ninja;

import br.com.diego.projeto.springestudos.missoes.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/BemVindo")
    public String olaSping(){
        return "Ola minha primeira intereção com spring ";
    }

    @PostMapping("/Cadastra")
    public String criarNovoCadastro(){
        return "Cadastro finalizado! ";
    }

    @GetMapping("/Listar")
    public List<> listarTodosCadastro(){
        return "Lista de cadastro";
    }

    @GetMapping("/BuscarCadastroID")
    public String buscarPorId(){
        return "Busca de cadastro";
    }

    @PutMapping("/Atualizar Dados")
    public String atualizarCadastro(){
        return "Cadastro Atualizado";
    }

    @DeleteMapping("/Deletar")
    public String deletarCadastroPorId(){
        return "Cadastro deletado";
    }
}
