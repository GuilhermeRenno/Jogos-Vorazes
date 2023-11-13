package br.com.Jogosvorazes.pessoas;

import br.com.Jogosvorazes.Edicao;
import br.com.Jogosvorazes.distritos.Distritos;

public class Jogadores extends Pessoa {
    private Double nota;
    private Edicao edicao;
    public Jogadores(String nome, String sexo, Distritos distrito, Double nota, Edicao edicao) {
        super(nome, sexo, distrito);
        this.nota = nota;
        this.edicao = edicao;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Edicao getEdicao() {
        return edicao;
    }

    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }
    public void treinar(Double treinamento){
        this.nota = nota+treinamento;
    }
    public  String lutar(){
        return "voce esta lutando nos jogos, seja o ultimo de pé"+"\r\n";
    }
}
