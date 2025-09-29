
import java.util.Locale;

public class aula1 {
    public static void main(String[] args) {

        int y = 10;
        double x = 11.12;
        float a = 12.34f;
        String b = "igor";
        char c = 'c';

        System.out.println("Hello, World!");
        System.out.println("Meu primeiro programa em Java");
        System.out.println("O valor de y é: " + y);
        System.out.println("O valor de x é: " + x);
        System.out.println("O valor de a é: " + a);
        System.out.println("O valor de b é: " + b);
        System.out.println("O valor de c é: " + c);

        System.out.printf("O valor de y é: %d\n", y);
        System.out.printf("O valor de x é: %.1f\n", x);
        System.out.printf("O valor de a é: %.4f\n", a);
        
        Locale.setDefault(Locale.US);

        System.out.printf("o %s tem %d anos e ganha %.2f reais\n", b, y, x);

        

    }
}