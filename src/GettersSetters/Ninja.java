package GettersSetters;

public abstract class Ninja {
    private String nome;
    private String aldeia;
    private int idade;
    private int numeroMissaoConcluida;
    private double altura = 1.80;

    public Ninja(String aldeia, double altura, int idade, String nome, int numeroMissaoConcluida) {
        this.aldeia = aldeia;
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.numeroMissaoConcluida = numeroMissaoConcluida;
    }

    public Ninja() {
    }

    //Tirar dados ou mostrar eu uso GET + Nome da varável

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMissaoConcluida() {
        return numeroMissaoConcluida;
    }

    public void setNumeroMissaoConcluida(int numeroMissaoConcluida) {
        this.numeroMissaoConcluida = numeroMissaoConcluida;
    }
}
