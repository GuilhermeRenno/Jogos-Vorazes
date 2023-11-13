package br.com.Jogosvorazes.pessoas;

import br.com.Jogosvorazes.distritos.Distritos;

import java.util.Random;

public class Treinadores extends Pessoa{
    private Jogadores jogadores;

    public Treinadores(String nome, String sexo, Distritos distrito, Jogadores jogadores) {
        super(nome, sexo, distrito);
        this.jogadores = jogadores;
    }

    public Jogadores getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogadores jogadores) {
        this.jogadores = jogadores;
    }
    public String treinarTributoLuta(){
        Random aleatorio = new Random();
        int treino = aleatorio.nextInt(101);

        if (treino>50){
            getJogadores().treinar(1.0);
            return "Seu tributo aprendeu bem, suas chances de sobreviver ao lutar aumentaram";
        }else {
            return "Seu tributo não aprendeu bem, suas chances de sobreviver a uma luta são as mesmas";
        }
    }
    public String treinarTributoSobrevivencia(){
        Random aleatorio = new Random();
        int treino = aleatorio.nextInt(101);
        if (treino>50){
            getJogadores().treinar(0.5);
            return "Seu tributo aprendeu bem, suas chances de sobreviver na arena aumentaram";
        }else {
            return "Seu tributo não aprendeu bem, suas chances de sobreviver na arena são as mesmas";
        }
    }
}
