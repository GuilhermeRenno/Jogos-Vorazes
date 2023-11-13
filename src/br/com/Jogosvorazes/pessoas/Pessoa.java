package br.com.Jogosvorazes.pessoas;

import br.com.Jogosvorazes.distritos.Distritos;

public abstract class Pessoa {
    private String Nome;
    private String Sexo;
    private Distritos Distrito;

    public Pessoa(String nome, String sexo, Distritos distrito) {
        this.Nome = nome;
        this.Sexo = sexo;
        this.Distrito = distrito;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }

    public Distritos getDistrito() {
        return Distrito;
    }

    public void setDistrito(Distritos distrito) {
        this.Distrito = distrito;
    }
}
