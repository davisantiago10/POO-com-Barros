public class PrincipalFuncionario {
    public static void main(String[] args){
        Funcionario f = new Funcionario(1, "Davi", "123445", "Cuitegi", 9394949, 17, 1984);

        f.Imprimir(); 


        // Alterando o salário
        f.setSalario(2000);
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("    NOVOS DADOS");
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        f.Imprimir();
    }
}