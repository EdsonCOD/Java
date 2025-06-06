package NivelIntermediario01;

public class Hokage implements SharinganInterface, AnbuInterface{

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    String inimigos;
    String habilidade;


    public Hokage(){
        // CONSTRUTOR VAZIO, SEM ARGUMENTO
    }

    // CRIAR UM CONSTRUTOR COM UM ARGUMENTO
    public Hokage(String nome){
        this.nome = nome;
    }
    public Hokage(int idade){
        this.idade = idade;
    }

    // CRIAR CONSTRUTOR COM TODOS OS ARGUMENTOS
    public Hokage(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    // CONTRUTOR DICA : ALT + INSERT -> CONSTRUCT (e seleciona todos)
    public Hokage(String aldeia, String habilidade, int idade, String inimigos, String nome, boolean vivoOuNao) {
        this.aldeia = aldeia;
        this.habilidade = habilidade;
        this.idade = idade;
        this.inimigos = inimigos;
        this.nome = nome;
        this.vivoOuNao = vivoOuNao;
    }

    // Método da interface
    @Override
    public void Sharingan() {
        System.out.println(nome + " Ativou o Sharingan");
    }

    // Método da interface

    @Override
    public void bemVindoAnbu() {
        System.out.println(nome + " Eu sou um ninja da Anbu");
    }
}
