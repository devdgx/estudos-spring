package br.com.diego.projeto.springestudos.missoes;

import br.com.diego.projeto.springestudos.ninja.Missoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<Missoes, Long> {
}
