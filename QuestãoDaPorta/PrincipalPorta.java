package PrimeiroProjeto.QuestãoDaPorta;

public class PrincipalPorta {
    public static void main(String[] args){
        Porta p = new Porta("Marrom", (float) 2.4, 2, true);
        p.Imprimir();

        System.out.println("-=-=-=-=-=-=--=-=-=-=-=-=-=-");
        p.setEstaAberta(false);
        p.Imprimir();
    }
}
