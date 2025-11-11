    package br.com.diego.projeto.springestudos.ninja;

    import org.springframework.data.jpa.repository.JpaRepository;

    public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
    }
