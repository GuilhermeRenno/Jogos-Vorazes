package br.com.Jogosvorazes;

import br.com.Jogosvorazes.pessoas.Organizador;
import br.com.Jogosvorazes.pessoas.Treinadores;

public class Edicao {
    private int ano;
    private Organizador organizador;
    private String regras;

    private Treinadores treinadores;
    public Edicao(int ano, Organizador organizador, String regras) {
        this.ano = ano;
        this.organizador = organizador;
        this.regras = regras;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getOrganizador() {
        if (organizador == null) {
            return "Organizador não definido";
        } else {
            return organizador.getNome();
        }
    }
    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        StringBuilder regrasBuilder = new StringBuilder();
        if (this.regras != null && !this.regras.isEmpty()) {
            regrasBuilder.append(this.regras);
        }
        regrasBuilder.append(", ");
        regrasBuilder.append(regras);

        this.regras = regrasBuilder.toString();
    }
}
