package br.com.diego.projeto.springestudos.missoes;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }


    @GetMapping("/buscarPorId/{id}")
    public MissoesModel buscarPorId(@PathVariable Long id){
        return missoesService.buscarPorId(id);
    }


    @GetMapping("/listar")
    public List<MissoesModel> listarMissaoes(){
        return missoesService.listarMissoes();

    }
    @PostMapping("/criar")
    public String criarMissoes(){
        return "missao criada!";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada!";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada!";
    }
}