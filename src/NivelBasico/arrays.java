package NivelBasico;

public class arrays {
    public static void main(String[] args) {

        // arrays sempre tem um tipo, tem tamanho fixo e não são flexiveis
        //arrays = agrupar coisas do mesmo tipo
        // arrays sao tipo de dados nao primitivo => tipo de referência
       // array de tipo string, só vai aceitar strings

        // Array string
        // string inicializa o null
        String[] ninja = new String[4];

        // tem que ordenar os espaços dos arrays
        // lembre-se contagem começa em 0(index) e não em 1

        ninja[0] = "naruto uzumaki";
        ninja[1] = "sakura haruno";
        ninja[2] = "sasuke uchiha";
        ninja[3] = "kakashi hatake";

        System.out.println(ninja[0]);
        System.out.println(ninja[1]);
        System.out.println(ninja[2]);
        System.out.println(ninja[3]);

        //se quiser aumentar o array nao pode esquecer de liberar mais "espaços" no array [x + 1] => [3 + 1] = [4]

       String nomeDoNinja1 = "Gaara do deserto"; // criou outra referencia
        String nomeDoNinja2 = "Rock lee";        // criou outra referencia
        String nomeDoNinja300 = "X";             // criou 300 referencia e ocupou muita memoria
                                                 // um ARRAY é x espaços que ocupam apenas uma referencia


       // Array int
        // int inicializa com 0
        int[] idade = new int[2];
        idade[0] = 16;

        System.out.println(idade[0]);

        // Array boolean
        // boolean inicializa com false
        boolean[] verdadeiroOuFalso = new boolean[2];
        System.out.println(verdadeiroOuFalso[0]);



        // Redeclarar ARRAY
        // Quando redeclara um array sobrescreve a memoria, os antigos arrays nao existe mais
        ninja = new String[7];
        System.out.println(ninja[0]);  // saida --> null
                                       // pode alocar novos valores

        ninja[0] = "Hashirama";
        ninja[1] = "Tobirama";
        ninja[2] = "Hiruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        ninja[6] = "Naruto";

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }




    }
}
