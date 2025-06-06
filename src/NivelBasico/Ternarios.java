package NivelBasico;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Quantos anos voce tem? ");
        System.out.println("Digite aqui: ");
        int anos = scanner.nextInt();

        // ternarios é usado para reduzir o código
        // variável = (condição) ? "valorSeVerdadeiro" : "valorSeFalso";
        String resultado = (anos >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println(resultado);
        scanner.close();
    }
}
