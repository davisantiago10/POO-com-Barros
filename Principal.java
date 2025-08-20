
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Turma turma = new Turma();
        turma.adicionarAluno(new Aluno("Hugo", 102, 8.5, 7.0));
        turma.adicionarAluno(new Aluno("Davi", 200, 9.5, 10.0));
        turma.adicionarAluno(new Aluno("Thayná", 100, 0, 4.0));

    

        turma.listarAlunos();
    
        System.out.println("=== Buscar Aluno ===");
        System.out.println("Digite sua matrícula:");
        int matricula = sc.nextInt();
        turma.buscarPorMatricula(matricula);
        

        sc.close();

    }
    
}
