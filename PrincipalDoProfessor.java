public class PrincipalDoProfessor {
    public static void main(String[] args){
        Professor p = new Professor(12345, "Davi", "Informática");
        p.imprimir();
        //alterando
        System.out.println("===== NOVOS DADOS =====");
        p.setDepartamento("POO");
        p.imprimir();
    }
}
