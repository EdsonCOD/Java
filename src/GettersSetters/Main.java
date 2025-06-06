package GettersSetters;

public class Main {
    public static void main(String[] args) {

        System.out.println("------Naruto Uzumkai-------");
        Uzumaki naruto = new Uzumaki("folha", 1.80, 18, "Naruto Uzumaki", 20);
        System.out.println(naruto.getNome());
        naruto.setNome("Xaruto Uzumaki");
        System.out.println(naruto.getNome());

        System.out.println("------Sasuke Uchiha-----");
        Uchiha saske = new Uchiha("Folha", 1.79, 19, "Sasuke Uchiha", 26);
        System.out.println(saske.getNome());
        saske.setNome("Xusuke Uchiha");
        System.out.println(saske.getNome());
    }
}
