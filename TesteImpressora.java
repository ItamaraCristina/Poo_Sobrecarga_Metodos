public class TesteImpressora {
    public static void main(String[] args) {
        Impressora print = new Impressora();

        print.exibir(5.5f);
        print.exibir(3.5f,2.5f);
        print.exibir(4.5f,"6");
        print.exibir("5", 9.5f);
        print.exibir("8","4","7");
        print.exibir(6,3,"3");
    }
}