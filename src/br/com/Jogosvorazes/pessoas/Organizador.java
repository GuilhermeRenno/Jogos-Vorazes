package br.com.Jogosvorazes.pessoas;

import br.com.Jogosvorazes.Edicao;
import br.com.Jogosvorazes.distritos.Distritos;

public class Organizador extends Pessoa {
    private Edicao edicao;

    public Organizador(String nome, String sexo, Distritos distrito, Edicao edicao) {
        super(nome, sexo, distrito);
        this.edicao = edicao;
    }

    public Object getEdicao() {
        if (edicao == null) {
            return "Edição não definida";
        } else {
            return edicao;
        }
    }
    public void setEdicao(Edicao edicao) {
        this.edicao = edicao;
    }


    public  void editarRegras(String comando){

        edicao.setRegras(comando);
    }
}
