package br.com.diego.projeto.springestudos;

import org.springframework.web.bind.annotation.*;

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
    public String listarTodosCadastro(){
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
s
}
