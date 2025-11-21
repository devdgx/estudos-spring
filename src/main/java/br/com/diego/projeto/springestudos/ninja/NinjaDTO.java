package br.com.diego.projeto.springestudos.ninja;
import br.com.diego.projeto.springestudos.missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {


    private long id;
    private String name;
    private String email;
    private int age;
    private String rank;
    private MissoesModel missoes;

}
