package NivelBasico;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        System.out.println("Ola, mundo");

        String nome = "Edson Elias";
        System.out.println(nome);
        String nomeEmCaixaAlta = nome.toUpperCase();
        System.out.println("Esse texto ficou em letras maisculas: " + nomeEmCaixaAlta);

        String cidade = "JABOATAO DOS GUARARAPES";
        String cidadeLetrasmaiusculas = cidade.toLowerCase();
        System.out.println("as letras minusculas ficaram assim: " + cidadeLetrasmaiusculas);

    }
}