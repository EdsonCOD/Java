package NivelBasico;

public class LaçosDeRepetições {
    public static void main(String[] args) {

        //Laços de Reeptiçao: Vao repetir infinitamente ou enquanto o seu parametro tiver atendido
        // WHILE = FOR
        //While
        //While (condição) {tudo aqui vai acontecer}

        int numeroDeCLones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeCLones <= numeroMaximoDeClones) {
            numeroDeCLones++;
            System.out.println("O naruto fez um Clone das sombras " + numeroDeCLones);
        }


        //estrutura do FOR
        //FORI ajuda a nao cair num loop infinito

        int numeroDeRasengaShuriken = 0;
        int numeroMaximoRasengaShuriken = 30;
        for (int i = 0; i <= numeroMaximoRasengaShuriken; i++) {
            System.out.println("O naruto fez um rasenga shuriken " + i);
        }
    }
}
