import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int number;

        System.out.printf("Informe o número: ");
        number = read.nextInt();

        System.out.println("Tabela de multiplicação de " + number);

        for(int i = 0; i < 11; i++){
            int mult = i * number;
            System.out.println(i + " X " + number + " = " + mult);
        }
    }
}
