public class Main {
    public static void main(String[] args) {
        Hilo hilo1 =new Hilo('A',10);
        Hilo hilo2 =new Hilo('B',10);
        Hilo hilo3 =new Hilo('C',10);
        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
