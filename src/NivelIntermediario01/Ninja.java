package NivelIntermediario01;

public abstract class Ninja implements EstrategiaDeBatalhaNinja{
    String nome;
    String aldeia;
    int idade;

    // Metodo geral! todos ninjas vão ter
    public void habilidadeQueNinjaTem(){
        System.out.println("Meu nome é " + nome + " e minha habilidade padrão é Jogar kunay");
    }

    // Criar um metodo String
    public String euSouUmNinja(){
        return "Oi, eu sou um Ninja";
    }

    //Criar um metodo Int
    public int anosHokage(int idadeMiminaParaSerHokage ){
        return idadeMiminaParaSerHokage - idade;
    }

    // Sobrescrevendo o método da interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é " + nome + " e Essa é a minha estrategia de batalha ninja");
    }

    //Sobrecarga de Métodos - Inteligencia de Combate
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é " + nome + " Essa é minha inteligencia de Combate");
    }

    //Sobrecarga de Métodos - Inteligencia de Combate
    public void inteligenciaDeCombate(int qi){
        if (qi > 150) {
            System.out.println("Seu qi é: " + qi + " e voce pe um genio");
        }else if (qi >= 120) {
            System.out.println("Seu qi é: " + qi + " e voce é um Prodigios");
        }else {
            System.out.println("Voce precisa treinar mais");
        }
    }


    @Override
    public String toString() {
        return "Meu nome é " + nome + " eu sou da " + aldeia +  " e tenho " + idade + " anos";
    }
}
