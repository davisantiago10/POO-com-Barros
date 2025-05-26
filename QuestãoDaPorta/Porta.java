package PrimeiroProjeto.QuestãoDaPorta;

public class Porta {
    private String cor;
    private float altura;
    private float largura;
    private boolean estaAberta;


    public Porta(String cor, float altura, float largura, boolean estaAberta){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getLargura(){
        return largura;
    }

    public void setLargura(float largura){
        this.largura = largura;
    }


    public boolean getEstaAberta(){
        return estaAberta;
    }

    public void setEstaAberta(boolean estaAberta){
        this.estaAberta = estaAberta;
    }

    public String AbertaFechada(){
        if(estaAberta == true){
            return "aberta";
        }
        else{
            return "fechada";
        }
    }
    public String toString(){
        return "Cor da porta: " + cor + "\nAltura: " + altura + "\nLargura: " + largura + "\nA porta está "+ AbertaFechada();
    }
    public void Imprimir(){
        System.out.println(toString());
    }

}