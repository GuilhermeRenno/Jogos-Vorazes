package br.com.Jogosvorazes.pessoas;

import br.com.Jogosvorazes.distritos.Distritos;

public class Patrocinador extends Pessoa{
    private Jogadores tributoPatrocinado;

    public Patrocinador(String nome, String sexo, Distritos distrito, Jogadores tributoPatrocinado) {
        super(nome, sexo, distrito);
        this.tributoPatrocinado = tributoPatrocinado;
    }

    public Jogadores getTributoPatrocinado() {
        return tributoPatrocinado;
    }

    public void setTributoPatrocinado(Jogadores tributoPatrocinado) {
        this.tributoPatrocinado = tributoPatrocinado;
    }
    public String enviarMantimentos(){
        return "Enviando recursos para "+tributoPatrocinado.getNome()+" ,torcemos para seu sucesso";
    }
}
