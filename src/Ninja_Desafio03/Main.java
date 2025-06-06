package Ninja_Desafio03;

public class Main {
    public static void main(String[] args) {

        Uchiha Itachi = new Uchiha();
        Itachi.nome = "Itachi Uchiha";
        Itachi.idade = 21;
        Itachi.missao = "Capturar o Naruto";
        Itachi.statusDaMissao = "Em Andamento";
        Itachi.nivelDaDificuldade = "Médio";
        Itachi.habilidadeEspecial = "Bola de fogo";

        Itachi.mostrarInformacoes();
        Itachi.mostrarHabilidadeEspecial();
    }
}
