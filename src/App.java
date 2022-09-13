import java.util.Scanner;

public class App {
    public static void main (String[] args){
        Calculadora calc = new Calculadora(); // Instanciando a classe calculadora
        Scanner sc = new Scanner(System.in);  // Instanciando a classe Scanner - Possibilitando a entrada de dados

        System.out.println("Digite a Nota 1: "); // Mostrando na tela a alternativa de entrada de dados
        int nota1 = sc.nextInt();   // Atribuindo o proximo inteiro para a variavel Nota 1
        System.out.println("Digite a Nota 2: ");
        int nota2 = sc.nextInt();
        int resultado = nota1 + nota2; // Atribuindo a variavel resultado o seu valor
        System.out.println("A soma das suas notas são: " + resultado); // Mostrando na tela o o valor da variavel resultado



    }

}
