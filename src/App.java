
import java.util.Scanner;
ja
public class App {
    public static void main (String[] args){
        Calculadora calc = new Calculadora(); // Instanciando a classe calculadora
        Scanner sc = new Scanner(System.in);  // Instanciando a classe Scanner - Possibilitando a entrada de dados

        System.out.println("Escolha sua operação \n 1 - somar  \n 2 - dividir  \n 3 - multiplicar \n 4 - subtrair  \n");
        int op = sc.nextInt();
        if(op == 1){
            System.out.println("Digite a Nota 1: "); // Mostrando na tela a alternativa de entrada de dados
            int nota1 = sc.nextInt();   // Atribuindo o proximo inteiro para a variavel Nota 1
            System.out.println("Digite a Nota 2: ");
            int nota2 = sc.nextInt();
            System.out.println(calc.somar(nota1,nota2));

        } else if (op == 2) {
            System.out.println("Digite a Nota 1: "); // Mostrando na tela a alternativa de entrada de dados
            float nota1 = sc.nextFloat();   // Atribuindo o proximo inteiro para a variavel Nota 1
            System.out.println("Digite a Nota 2: ");
            float nota2 = sc.nextFloat();
            System.out.println(calc.dividir(nota1,nota2));

        } else if (op == 3) {
            System.out.println("Digite a Nota 1: "); // Mostrando na tela a alternativa de entrada de dados
            float nota1 = sc.nextFloat();   // Atribuindo o proximo inteiro para a variavel Nota 1
            System.out.println("Digite a Nota 2: ");
            float nota2 = sc.nextFloat();
            System.out.println(calc.multiplicar(nota1,nota2));

        } else if (op == 4) {
        System.out.println("Digite a Nota 1: "); // Mostrando na tela a alternativa de entrada de dados
        float nota1 = sc.nextFloat();   // Atribuindo o proximo inteiro para a variavel Nota 1
        System.out.println("Digite a Nota 2: ");
        float nota2 = sc.nextFloat();
        System.out.println(calc.subtrair(nota1,nota2));
        }else {
            System.out.println("Valor inválido");
        }
    }

}