import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        String frutas, cor, formato;
        sc.nextLine(); // Consumir a quebra de linha pendente
        frutas = sc.nextLine();
        cor = sc.nextLine();
        formato = sc.nextLine();

        System.out.printf("O nome dele é: %s\n", nome);
        System.out.printf("As frutas favorita dele é: %s\n", frutas);
        System.out.printf("A cor favorita dele é: %s\n", cor);
        System.out.printf("O formato favorito dele é: %s\n", formato);

        sc.close();
    }
}   