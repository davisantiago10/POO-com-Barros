public class Professor {
    private int matricula;
    private String nome;
    private String departamento;


    public Professor( int matricula, String nome, String departamento){
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
    }

    public int getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getDepartamento(){
        return departamento;
    }


    public void setMatricula(int novamatricula){
        this.matricula = novamatricula;
    }

    public void setNome(String novonome){
        this.nome = novonome;
    }

    public void setDepartamento(String novodepartamento){
        this.departamento = novodepartamento;
    }

    public String tabelaDados(){
        return "Dados do professor: \nNome: " + nome + "\nMatríula : " + matricula + "\nDepartamento: " + departamento;
    }

    public void imprimir(){
        System.out.println(tabelaDados());
    }
}
