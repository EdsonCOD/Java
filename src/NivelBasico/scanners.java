package NivelBasico;

import java.util.Scanner;

public class scanners {
    public static void main(String[] args) {
       // abrir scanner:
        Scanner IssoÉumScanners = new Scanner(System.in);

        System.out.println("Escreva aqui o seu nome: ");
        String nome = IssoÉumScanners.nextLine(); // scanner guarda a informação numa variável
        System.out.println("BEM-VINDO " + nome);

        System.out.println("Escreva aqui a sua idade: ");
        int idade = IssoÉumScanners.nextInt();
        System.out.println("A sua idade é " + idade + " anos ");

        if (idade >= 18 ){
            System.out.println("Já pode ser preso, pois tem " + idade + " anos ");
        } else {
            System.out.println("Não pode ser preso, pois tem " + " anos, e é menor de idade");
        }

        // lembre de sempre fechar o scanner:
        IssoÉumScanners.close();
    }
}
