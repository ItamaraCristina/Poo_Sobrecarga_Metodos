public class Impressora{

    public void exibir(float f1){
        System.out.println("\nImprimindo:" + f1);
    }

    public void exibir(float f1, float f2){
        System.out.println("\nImprimindo: " + f1 + ", " + f2);
    }

    public void exibir(float f1, String s1){
        System.out.println("I\nmprimindo: "+ f1+" ,"+ s1);
    }

    public void exibir(String s1, float f1){
        System.out.println("\nImprimindo: " + s1 + ", " + f1);
    }

    public void exibir(String s1, String s2, String s3){
        System.out.println("\nImprimindo: " + s1 + ", " + s2 + ", " + s3);
    }

    public void exibir(int a, int b, String s1){
        System.out.println("\nImprimindo: " + a + ", " + b + ", " + s1 );
    }
}