package br.com.diego.projeto.springestudos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.Banner;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Missoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List <Model> ninjas;
}
