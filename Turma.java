public class Turma {

    // Atributos
    private Aluno[] alunos = new Aluno[5];
    private int quantidade = 0;
    
    // Métodos
    public void adicionarAluno(Aluno aluno) {
        if (quantidade < alunos.length) {
            alunos[quantidade] = aluno;
            quantidade++;
        }

        else{
            System.out.println("Turma cheia!");
        }
    }

    public void listarAlunos(){
    System.out.println("==== Listar Alunos ====");
    for (int i = 0; i < quantidade; i++){
        alunos[i].exibirInfo();
    }
    }

    public  Aluno buscarPorMatricula(int matricula){
        for (int i = 0; i < quantidade; i++){
            if (alunos[i].getMatricula() == matricula){
                alunos[i].exibirInfo();
            }
        }
        return null;
    }
}


            
            
