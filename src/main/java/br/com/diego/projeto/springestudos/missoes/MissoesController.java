package br.com.diego.projeto.springestudos.missoes;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/ListarMissaoes")
    public String listarMissaoes(){
        return "Listar missaoes!";

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
