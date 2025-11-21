package br.com.diego.projeto.springestudos.ninja;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;
    }



    //Listar todos os ninjas
    public List<NinjaDTO> listarNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    //Buscar ninja por ID
    public NinjaModel buscaPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //Add ninja
    public NinjaModel criarNinja(NinjaModel ninjaModel){
        return ninjaRepository.save(ninjaModel);
    }

    //deletar ninja
    public void deletarNinjaPorId(Long id){
         ninjaRepository.deleteById(id);
    }

    //
    public NinjaModel atualizar (Long id, NinjaModel ninjaAtualizar){
        if (ninjaRepository.existsById(id)){
            ninjaAtualizar.setId(id);
            return ninjaRepository.save(ninjaAtualizar);
        } return null;
    }
}
