package Ninja_Desafio03;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDaDificuldade;
    String statusDaMissao;

    public void mostrarInformacoes(){
        System.out.println("Meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha missão é " + missao);
        System.out.println("Nivel de dificuldade -> " + nivelDaDificuldade);
        System.out.println("E o status da missão é " + statusDaMissao);
    }
}
