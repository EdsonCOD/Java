package NivelIntermediario01;


public class Main {
    public static void main(String[] args) {

        // Criar o ninja naruto
        // objeto 1
        Uzumaki Naruto =  new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 16;
        Naruto.habilidadeQueNinjaTem();
        Naruto.ModoSabio();

        //Criar o ninja sasuke
        // objeto 2
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Folha", 18);
        Sasuke.Sharingan();
        Sasuke.habilidadeQueNinjaTem();
        Sasuke.inteligenciaDeCombate(100);

        // Criar o ninja sakura
        // objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 17;
        Sakura.Cura();
        Sakura.habilidadeQueNinjaTem();
        Sakura.estrategiaDeBatalhaNinja();

        //Criar o ninja Boruto
        //objeto 4, usando interfaces
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuha Uzumaki";
        Boruto.aldeia = "Folha";
        Boruto.idade = 9;
        Boruto.AtivarOkarma();
        Boruto.AtivarJougan();

        //Criar hokage
        //objeto 5
        Hokage Minato = new Hokage();
        Minato.nome = "Minato Uzumaki";
        Minato.idade = 25;
        Minato.vivoOuNao = false;

        //objeto 6
        Hokage Tobirama = new Hokage("Tobirama");
        System.out.println(Tobirama.nome);

        //objeto 7
        Hokage Hiruzen = new Hokage(40);
        System.out.println(Hiruzen.idade);

        //objeto 8
        Hokage Hashirama = new Hokage("Hashirama", 32, false);
        System.out.println(Hashirama.nome);
        System.out.println(Hashirama.idade);
        System.out.println(Hashirama.vivoOuNao);

        //obeto 9
        Hokage Kakashi = new Hokage("Folha", "Shidore" , 35, "Obito Uchiha", "Kakashi Hatak" , true);
        System.out.println(Kakashi.nome);
        System.out.println(Kakashi.idade);
        System.out.println(Kakashi.aldeia);
        System.out.println(Kakashi.habilidade);
        System.out.println(Kakashi.vivoOuNao);
        System.out.println(Kakashi.inimigos);
        Kakashi.Sharingan();
        Kakashi.bemVindoAnbu();


        //objeto 10
        //objeto uchiha
        Uchiha Madara = new Uchiha("Madara Uchiha", "Folha", 20);
        System.out.println(Madara);  // objeto de referência de memoria toString
        Madara.estrategiaDeBatalhaNinja();
        Madara.habilidadeQueNinjaTem();
        Madara.inteligenciaDeCombate();
        Madara.inteligenciaDeCombate(180);

        //objeto 10
        //Classe abstrata



        //aplicando Metodos aos objetos

        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosHokage(70);
        System.out.println("Voce tem: " + Sasuke.idade + " ,entao falta no minimo: " + quantoTempoFalta);



    }
}
