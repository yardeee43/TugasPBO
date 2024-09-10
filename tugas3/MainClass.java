package tugas3;

public class MainClass {
    public static void main(String[] args) {
        Brio brio = new Brio("Honda Brio");
        brio.dealer();
        brio.gerak();
        brio.gerak(100);
        brio.punyaRoda();
        brio.cek();

        System.out.println();

        Revo revo = new Revo ("Revo");
        revo.dealer();
        revo.gerak();
        revo.gerak(80);
        revo.punyaRoda();
        revo.cek();
        System.out.println();

    }
}
