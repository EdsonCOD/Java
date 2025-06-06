package NivelIntermediario01;

public class Uchiha extends Ninja implements SharinganInterface{

    public Uchiha(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Método da interface
    public void Sharingan(){
        System.out.println(nome + " Sharingan foi ativado");
    }

    @Override
    public void habilidadeQueNinjaTem(){
        System.out.println("Meu nome é " + nome + " e minha habilidade padrão é bola de fogo");
    }

    //inteligencia de combate sobrescrito e sobrecarregado
    @Override
    public void inteligenciaDeCombate(int qi){
        if (qi > 150) {
            System.out.println("Seu qi é: " + qi + " e voce é um genio " + nome);
        }else if (qi >= 120) {
            System.out.println("Seu qi é: " + qi + " e voce é um Prodigio " + nome);
        }else {
            System.out.println("Seu qi é: " + qi + " e Voce precisa treinar mais " + nome);
        }
    }
}
