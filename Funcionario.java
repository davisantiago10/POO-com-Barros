public class Funcionario {
    private int codigo;
    private String nome;
    private String CPF;
    private String endereco;
    private int telefone;
    private int idade;
    private float salario;

    public Funcionario(int codigo, String nome, String CPF, String endereco, int telefone, int idade, float salario){
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    // Definição
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public float getSalario() {
        return salario;
    }

    public String MostraDados(){
        return "Dados do funcionário: \nCódigo: " + codigo + "\nnome: " + nome + "\nCPF: " +  CPF + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nIdade: " + idade + "\nSalário: "  + salario + "\nSalário Líquido: " + CalculaSalarioLiquido();
    }

    public void Imprimir(){
        System.out.println(MostraDados());
    }

    public float CalculaSalarioLiquido(){
        return salario - (salario * 0.11f);
    }
 // OS de mudar


    public void SetCodigo(int novoCodigo){
        this.codigo = novoCodigo;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void setTelefone(int novoTelefone) {
        this.telefone = novoTelefone;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public void setSalario(float novoSalario) {
        this.salario = novoSalario;
    }


}
