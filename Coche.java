public class Coche () {
    int km = 0;
    boolean verificado;

    public Coche (int km, boolean verificado) {
        km = this.km;
        verificado = this.verificado;
    }

    public int getKm() {
        return km;
    }

    public boolean getVerificado() {
        return verificado;
    }

    pubic static void main (String args[]) {
        Coche eduaroCoche = new Coche(10, true);
        System.out.println(eduaroCoche.getKm);
    }
}