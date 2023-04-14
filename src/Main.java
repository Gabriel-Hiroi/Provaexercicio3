public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel", 18, 'M', 777777);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Sexo: " + aluno.getSexo());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}