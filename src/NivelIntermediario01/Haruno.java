package NivelIntermediario01;

public class Haruno extends Ninja{

    public void Cura(){
        System.out.println("Eu sou " + nome + ". E eu ativei minha cura");
    }

    @Override
    public void habilidadeQueNinjaTem(){
        System.out.println("Meu nome é " + nome + " e minha habilidade padrão é soco forte");
    }

}
