package NivelBasico;

import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu genero: ");
        String genero = scanner.nextLine();
        System.out.println("Seu genero é " + genero);


        switch (genero){
            case "hetero":
                System.out.println("Voce gosta do seu genero oposto");
                break;
            case "homossexual":
                System.out.println("Voce gosta do seu mesmo genero");
                break;
            case "lesbica":
                System.out.println("Voce gosta de mulher, em que é seu genero idêntico");
                break;
            case "cis":
                System.out.println("Voce gosta do seu genero oposto");
                break;
            case "gay":
                System.out.println("Voce gosta do seu genero idêntico");
                break;
            case "pan":
                System.out.println("Tem buraco é dento");
                break;
            case "hetero top":
                System.out.println("Voce gosta do seu genero oposto(hetero) e tem um ego grande");
                break;
            default: // caso padrão
                System.out.println("Voce escolheu um genero nao valido, tente novamente");




        scanner.close();
        }




























        scanner.close(); //fechei o scanner, tudo que abre ele fecha tambem











    }
}
