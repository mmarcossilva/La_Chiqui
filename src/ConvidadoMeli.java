public class ConvidadoMeli extends Pessoa{
    public ConvidadoMeli(String nome) {
        super(nome);
    }

    @Override
    public void comerBolo() {
        super.comerBolo();
        System.out.println("Viva la Chiqui !!");
    }
}
