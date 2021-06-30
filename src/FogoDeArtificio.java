public class FogoDeArtificio {
    private String som;

    public FogoDeArtificio() {
        this.som = "BUM";
    }

    public FogoDeArtificio(String som) {
        this.som = som;
    }

    public void explodir(){
        System.out.println(som);
    }
}
