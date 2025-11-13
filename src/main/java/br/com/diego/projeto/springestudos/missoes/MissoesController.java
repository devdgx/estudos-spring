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
    public MissoesModel criarMissoes(@RequestBody MissoesModel missoesModel){
        return missoesService.criarMissao(missoesModel);
    }

    @PutMapping("/atualizar/{id}")
    public MissoesModel atualizarMissao(@PathVariable Long id, @RequestBody MissoesModel missaoAtualizada){
        return missoesService.atualizarMissao(id, missaoAtualizada);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissao(id);
    }
}