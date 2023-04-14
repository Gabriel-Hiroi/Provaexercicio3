public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, char sexo, int matricula) {
        super(nome, idade, sexo);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}