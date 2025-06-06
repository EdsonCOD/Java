package NivelBasico;

public class DESAFIO_01 {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto";
        int idade1 = 14;
        String missao1 = "Encontrar o bandido";
        String StatusDaMissao1 = "Em andamento";
        char NivelDaMissao1 = 'D';

        if (idade1 < 15){
            if (NivelDaMissao1 == 'C' || NivelDaMissao1 == 'D'){
                StatusDaMissao1 = "Missao Conlcuida";
            } else {
                StatusDaMissao1 = "Missao Nao Concluida, menor de idade";
            }
        } else {
            StatusDaMissao1 = "Missao Concluida, maior de idade";
        }

        System.out.println("---------------------------------");
        System.out.println("Nome do ninja = " + nomeNinja1);
        System.out.println("Idade do Ninja = " + idade1);
        System.out.println("Missao = " + missao1);
        System.out.println("Status da Missao = " + StatusDaMissao1);
        System.out.println("Nivel da Missao = " + NivelDaMissao1);
        System.out.println("---------------------------------");


        String nomeNinja2 = "Sasuke";
        int idade2 = 16;
        String missao2 = "Pegar o pergaminho proibido";
        String StatusDaMissao2 = "Em andamento";
        char NivelDaMissao2 = 'D';

        if (idade2 < 15){
            if (NivelDaMissao2 == 'C' || NivelDaMissao2 == 'D'){
                StatusDaMissao2 = "Missao concluida";
            } else {
                StatusDaMissao2 = "Missao Nao concluida, menor de idade";
            }
        } else {
            StatusDaMissao2 = "Missao concluida, maior de idade";
        }

        System.out.println("---------------------------------");
        System.out.println("Nome do ninja = " + nomeNinja2);
        System.out.println("Idade do Ninja = " + idade2);
        System.out.println("Missao = " + missao2);
        System.out.println("Status da Missao = " + StatusDaMissao2);
        System.out.println("Nivel da Missao = " + NivelDaMissao2);
        System.out.println("---------------------------------");

        String nomeNinja3 = "Sakura";
        int idade3 = 15;
        String missao3 = "Pegar uma fruta rara";
        String StatusDaMissao3 = "Em andamento";
        char NivelDaMissao3 = 'S';

        if (idade3 < 15){
            if (NivelDaMissao3 == 'C' || NivelDaMissao3 == 'D'){
                StatusDaMissao3 = "Missao concluida";
            } else {
                StatusDaMissao3 = "Missao Nao Concluida, menor de idadae";
            }
        } else {
            StatusDaMissao3 = "Missao concluida, maior de idade";
        }

        System.out.println("---------------------------------");
        System.out.println("Nome do ninja = " + nomeNinja3);
        System.out.println("Idade do Ninja = " + idade3);
        System.out.println("Missao = " + missao3);
        System.out.println("Status da Missao = " + StatusDaMissao3);
        System.out.println("Nivel da Missao = " + NivelDaMissao3);
        System.out.println("---------------------------------");































    }
}
