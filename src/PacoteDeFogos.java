import java.util.List;

public class PacoteDeFogos {
    public List<FogoDeArtificio> fogos;

    public PacoteDeFogos(List<FogoDeArtificio> fogos) {
        this.fogos = fogos;
    }

    public void estourarFogos(){
        for (FogoDeArtificio fogo: fogos) {
            fogo.explodir();
        }
    }
}
