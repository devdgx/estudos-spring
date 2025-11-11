package br.com.diego.projeto.springestudos.ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Ninja")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/BemVindo")
    public String olaSping(){
        return "Ola minha primeira intereção com spring ";
    }

    @PostMapping("/Cadastra")
    public String criarNovoCadastro(){
        return "Cadastro finalizado! ";
    }

    @GetMapping("/Listar")
    public List<NinjaModel> listarCadastro(){
        return ninjaService.listarNinjas() ;
    }

    @GetMapping("/BuscarCadastroID/{id}")
    public NinjaModel buscarPorId( @PathVariable Long id){
        return ninjaService.buscaPorId(id);
    }

    @PutMapping("/Atualizar-Dados")
    public String atualizarCadastro(){
        return "Cadastro Atualizado";
    }

    @DeleteMapping("/Deletar")
    public String deletarCadastroPorId(){
        return "Cadastro deletado";
    }
}
