public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calculator = new CalculadoraCientifica();

        byte a = 3, b = -1;

        System.out.println(calculator.raiz(8.4));
        System.out.println(calculator.raiz("5"));
        System.out.println(calculator.raiz(500));

        System.out.println(calculator.potencia("6", "2"));
        System.out.println(calculator.potencia(7, 3.5));
        System.out.println(calculator.potencia(a,b));
    }
}