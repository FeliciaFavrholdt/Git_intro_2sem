public class Konto {


    String navn;
    private int saldo;

    public Konto(String navn, int saldo) {
        this.navn = navn;
        this.saldo = saldo;
    }

//    overloaded constructor
    public Konto(String navn) {
        this.navn = navn;
        this.saldo = 0;
    }


}
