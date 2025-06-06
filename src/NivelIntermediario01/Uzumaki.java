package NivelIntermediario01;

public class Uzumaki extends Ninja{

    public void ModoSabio(){
        System.out.println("Meu nome é " + nome + ". E ativei o modo sabio");
    }

    @Override
    public void habilidadeQueNinjaTem(){
        System.out.println("Meu nome é " + nome + " e minha habilidade padrão é Jogar kunay");
    }
}
