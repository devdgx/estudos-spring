package br.com.diego.projeto.springestudos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long Id;

    @Column(name = "nome")
    private String name;
    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int age;
    @ManyToOne
    @JoinColumn(name = "id_missoes")
    private  Missoes missoes;

    public Model() {
    }

    public Model(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
