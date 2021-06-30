import java.util.List;

public class Evento {
    private List<Pessoa> convidados;

    private List<PacoteDeFogos> fogos;

    public Evento(List<Pessoa> convidados, List<PacoteDeFogos> fogos) {
        this.convidados = convidados;
        this.fogos = fogos;
    }

    public void horaDoBolo(){
        for (Pessoa pessoa: convidados) {
            pessoa.comerBolo();
        }
    }

    public void estourarFogos(){
        for (PacoteDeFogos pacote : fogos) {
            pacote.estourarFogos();
        }
    }
}
