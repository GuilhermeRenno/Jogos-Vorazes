package br.com.Jogosvorazes.pessoas;

import br.com.Jogosvorazes.distritos.Distritos;

import java.util.Random;

public class Publico extends Pessoa{
    private int aprovacao;

    public Publico(String nome, String sexo, Distritos distrito, int aprovacao) {
        super(nome, sexo, distrito);
        this.aprovacao = aprovacao;
    }

    public void setAprovacao(int aprovacao) {
        this.aprovacao = aprovacao;
    }

    public String getAprovacao() {
        Random aleatorio = new Random();
        int a = aleatorio.nextInt(101);
        if (a>=70){
            return "O publico esta adorando esta edicao dos Jogos Vorazes"+"\r\n";
        } else if (a<69 && a>=50) {
            return "O publico esta satisfeito, mas pede melhorias nesta edicao dos Jogos"+"\r\n";
        } else if (a<50 && a>20) {
            return "O publico esta insatisfeito com o os Jogos Vorazes"+"\r\n";
        } else  {
            return "O publico esta muito insatisfeito, Cuidado com as revoltas"+"\r\n";
        }

    }

}
