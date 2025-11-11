package br.com.diego.projeto.springestudos.ninja;

import br.com.diego.projeto.springestudos.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "nome")
    private String name;
    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int age;
    @ManyToOne
    @JoinColumn(name = "id_missoes")
    private MissoesModel missoes;

}
