import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pessoa");
        Pessoa pessoa1 = new Pessoa("Pessoa1");
        Pessoa pessoa2 = new Pessoa("Pessoa2");

        ConvidadoMeli convidadoMeli = new ConvidadoMeli("convidadoMeli");

        List<Pessoa> convidados = new ArrayList<>();
        convidados.add(pessoa);
        convidados.add(pessoa1);
        convidados.add(pessoa2);
        convidados.add(convidadoMeli);

        FogoDeArtificio fogoDeArtificio = new FogoDeArtificio();
        FogoDeArtificio fogoDeArtificio2 = new FogoDeArtificio("BANG");
        FogoDeArtificio fogoDeArtificio3 = new FogoDeArtificio("POW");
        FogoDeArtificio fogoDeArtificio4 = new FogoDeArtificio("!!!!");

        ArrayList<FogoDeArtificio> listaDeFogos = new ArrayList<>();
        listaDeFogos.add(fogoDeArtificio);
        listaDeFogos.add(fogoDeArtificio3);
        listaDeFogos.add(fogoDeArtificio4);

        ArrayList<FogoDeArtificio> listaDeFogos2 = new ArrayList<>();
        listaDeFogos2.add(fogoDeArtificio2);
        listaDeFogos2.add(fogoDeArtificio4);
        listaDeFogos2.add(fogoDeArtificio4);
        listaDeFogos2.add(fogoDeArtificio4);

        PacoteDeFogos pacoteDeFogos = new PacoteDeFogos(listaDeFogos);
        PacoteDeFogos pacoteDeFogos2 = new PacoteDeFogos(listaDeFogos2);

        ArrayList<PacoteDeFogos> listaDePacotes = new ArrayList<>();
        listaDePacotes.add(pacoteDeFogos);
        listaDePacotes.add(pacoteDeFogos2);

        Evento evento = new Evento(convidados, listaDePacotes);

        evento.estourarFogos();
        evento.horaDoBolo();
    }
}
