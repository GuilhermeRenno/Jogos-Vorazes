package br.com.Jogosvorazes.distritos;

public class Capital extends Distritos{
    private String presidente;

    public Capital(int numero, String tipoDeProducao, String presidente) {
        super(numero, tipoDeProducao);
        this.presidente = presidente;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    public String comandarCapital(){
        return "Bailes foram marcados e inimigos convidados, será que eles conseguiram sobrevier a festa?";
    }

    @Override
    public void detalhesDoDistrito() {
        System.out.println("Numero do distrito: "+getNumero()+" Capital");
        System.out.println("Tipo de Produção: "+getTipoDeProducao());
        System.out.println("Presidente: "+getPresidente()+"\r\n");
    }
}
