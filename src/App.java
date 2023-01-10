public class App {
    public static void main(String[] args) throws Exception {

        int number = 5;

        System.out.println("Tabela de multiplicação de " + number);

        for(int i = 0; i < 11; i++){
            int mult = i * number;
            System.out.println(i + " X " + number + " = " + mult);
        }
    }
}
