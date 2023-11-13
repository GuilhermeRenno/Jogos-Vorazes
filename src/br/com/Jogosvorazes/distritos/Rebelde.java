package br.com.Jogosvorazes.distritos;

import java.util.Random;

public class Rebelde extends Distritos{
    private String  Armamentos;

    public Rebelde(int numero, String tipoDeProducao, String armamentos) {
        super(numero, tipoDeProducao);
        Armamentos = armamentos;
    }

    public String getArmamentos() {
        return Armamentos;
    }

    public void setArmamentos(String armamentos) {
        Armamentos = armamentos;
    }
    public String lutarPelaLiberdade(){

        Random aleatorio = new Random();
        int ale = aleatorio.nextInt(101);
        int luta = ale + (Armamentos.length()/3);
        if (luta>50){
            return "Seu ataque teve bons resultados, suas tropas avançam em direção a capital"+"\r\n";
        }else {
            return "Seu ataque teve resultados ruins, suas tropas recuam em direção a sua base"+"\r\n";
        }
    }
    @Override
    public void detalhesDoDistrito() {
        System.out.println("Numero do distrito: "+getNumero());
        System.out.println("Tipo de Produção: "+getTipoDeProducao());
        System.out.println("Armamentos: "+getArmamentos()+"\r\n");
    }
}
