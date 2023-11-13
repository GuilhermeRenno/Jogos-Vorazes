import br.com.Jogosvorazes.Edicao;
import br.com.Jogosvorazes.distritos.Capital;
import br.com.Jogosvorazes.distritos.Produtores;
import br.com.Jogosvorazes.distritos.Rebelde;
import br.com.Jogosvorazes.pessoas.*;

public class Main {
    public static void main(String[] args) {

        Capital Penem = new Capital(0,"Entreterimento","Coriolanus Snow");
        Penem.detalhesDoDistrito();
        Produtores d12 = new Produtores(12,"carvão",1);
        d12.detalhesDoDistrito();
        Rebelde d13 = new Rebelde(13,"ArmasEstratégicas","bombas estrategicas e bombardeiros");
        d13.detalhesDoDistrito();

        Edicao ed1 = new Edicao(2065,null,"vale tudo, so um permanece vivo");
        Organizador organizador = new Organizador("organizador1","masculino",Penem,ed1);

        Jogadores j1 = new Jogadores("joao","masculino",d12,9.0,ed1);
        Treinadores t1 = new Treinadores("Gustavo","Masculino",d12,j1);

        Patrocinador p1 = new Patrocinador("p1","feminino",Penem,j1);
        Publico publico = new Publico("Capital","feminino",Penem,50);

        System.out.println("Organizador: "+ed1.getOrganizador());
        ed1.setOrganizador(organizador);
        System.out.println("Organizador: "+ed1.getOrganizador());

        System.out.println(j1.getNota());
        System.out.println(t1.treinarTributoLuta());
        System.out.println(j1.getNota());
        System.out.println(t1.treinarTributoSobrevivencia());
        System.out.println(j1.getNota());

        System.out.println(publico.getAprovacao());

        System.out.println(p1.enviarMantimentos());
        System.out.println(p1.getTributoPatrocinado().getNome());
        System.out.println(ed1.getRegras());
        organizador.editarRegras("todos devem comparecer ao centro da areno ao meio dia todo dia");
        System.out.println(ed1.getRegras());
        System.out.println(publico.getAprovacao());

        System.out.println(j1.lutar());
        System.out.println(d13.lutarPelaLiberdade());
        System.out.println(Penem.comandarCapital());
    }
}