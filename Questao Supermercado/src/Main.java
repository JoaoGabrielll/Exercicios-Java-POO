
public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.Cor = "Branca";
        lampada.marca = "Yamamura";
        lampada.modelo = "Ya23452i";
        lampada.preco = 23.90;
        lampada.voltagem = 24;
        lampada.tipo = "Led";
        lampada.garantia = 24;

        System.out.println("COR - " + lampada.Cor);
        System.out.println("MARCA - " + lampada.marca);
        System.out.println("MODELO - " + lampada.modelo);
        System.out.println("PREÇO - R$" + lampada.preco);
        System.out.println("VOLTAGEM - " + lampada.voltagem);
        System.out.println("TIPO - " + lampada.tipo);
        System.out.println("GARANTIA - " + lampada.garantia + " Meses");



    }
}