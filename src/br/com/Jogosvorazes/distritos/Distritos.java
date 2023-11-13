package br.com.Jogosvorazes.distritos;

public abstract class Distritos {
    private int numero;
    private String tipoDeProducao;

    public Distritos(int numero, String tipoDeProducao) {
        this.numero = numero;
        this.tipoDeProducao = tipoDeProducao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipoDeProducao() {
        return tipoDeProducao;
    }

    public void setTipoDeProducao(String tipoDeProducao) {
        this.tipoDeProducao = tipoDeProducao;
    }
    public abstract void detalhesDoDistrito();
}
