public class Coche {
    private int km = 0;
    private boolean verificado;

    public Coche (int km, boolean verificado) {
        km = this.km;
        verificado = this.verificado;
    }

    public Coche () {
        km = 0;
        verificado = false;
    }

    public int getKm() {
        return km;
    }

    public boolean getVerificado() {
        return verificado;
    }

    public static void main (String args[]) {
        Coche eduaroCoche = new Coche(10, true);
        System.out.println(eduaroCoche.getKm());
    }
}