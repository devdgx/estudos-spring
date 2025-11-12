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

    @PostMapping("/Criar")
    public NinjaModel criarNovoCadastro(@RequestBody NinjaModel ninjaModel){
        return ninjaService.criarNinja(ninjaModel);
    }

    @GetMapping("/Listar")
    public List<NinjaModel> listarCadastro(){
        return ninjaService.listarNinjas() ;
    }

    @GetMapping("/BuscarCadastroID/{id}")
    public NinjaModel buscarPorId( @PathVariable Long id){
        return ninjaService.buscaPorId(id);
    }

    @PutMapping("/ataulizar/{id}")
    public NinjaModel atualizarCadastro(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizar(id, ninjaAtualizado);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarCadastroPorId(@PathVariable Long id){
         ninjaService.deletarNinjaPorId(id);
    }
}
