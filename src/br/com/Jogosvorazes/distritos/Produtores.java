package br.com.Jogosvorazes.distritos;

public class Produtores extends Distritos{
    private int numTributosVencedores;

    public Produtores(int numero, String tipoDeProducao, int numTributosVencedores) {
        super(numero, tipoDeProducao);
        this.numTributosVencedores = numTributosVencedores;
    }

    public int getNumTributosVencedores() {
        return numTributosVencedores;
    }

    public void setTributosVencedores(int tributosVencedores) {
        this.numTributosVencedores = tributosVencedores;
    }

    @Override
    public void detalhesDoDistrito() {
        System.out.println("Numero do distrito: "+getNumero());
        System.out.println("Tipo de Produção: "+getTipoDeProducao());
        System.out.println("Numero de tributos vencedores: "+getNumTributosVencedores()+"\r\n");
    }
}
