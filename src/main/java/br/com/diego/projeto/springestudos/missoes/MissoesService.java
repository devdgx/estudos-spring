package br.com.diego.projeto.springestudos.missoes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    public MissoesModel buscarPorId(Long id){
        return missoesRepository.findById(id).orElse(null);
    }

    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }

    //Add missao
    public MissoesModel criarMissao(MissoesModel novaMissao){
        return missoesRepository.save(novaMissao);
    }

    public MissoesModel atualizarMissao(Long id, MissoesModel missoesAtualizada){
        if (missoesRepository.existsById(id)){
            missoesAtualizada.setId(id);
            return missoesRepository.save(missoesAtualizada);
        }return null;
    }
}
