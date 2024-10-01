
/**  Explicacion: sale desordenado porque al no utilizar metodos que lo organicen, ni tienen un orden especifico que se halla
 * especificado en un metodos los caracteres por lo tanto  al imprimirse salen desordenados **/



public class Hilo extends Thread{
    private char caracter;
    private int repeticionnes;

    public Hilo(char caracter, int repeticionnes) {
        this.caracter = caracter;
        this.repeticionnes = repeticionnes;

    }
    @Override
    public void run() {
        for (int i = 0; i < repeticionnes; i++) {
            System.out.println(caracter);

        }
    }



}
