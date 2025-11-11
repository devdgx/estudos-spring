package br.com.diego.projeto.springestudos.ninja;

import br.com.diego.projeto.springestudos.missoes.Model;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas
    public List<Model> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Buscar ninja por ID
    public Model buscaPorId(Long id) {
        return ninjaRepository.findById(id).orElse(null);
    }
}
