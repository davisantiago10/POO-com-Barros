public class Fitas {
    private String nome;
    private float aluguel;

    public Fitas(String nome, float aluguel){
        this.nome = nome;
        this.aluguel = aluguel;

    }
    public String getTitulo(){
        return nome;
    }
    public float getAluguel(){
        return aluguel;
    }

    public float ValorAluguelDias(int numDiasAlugados){
        return aluguel * numDiasAlugados;
    }

    public String ToString(){
        return "Fita de vídeo --> Título:  " + nome + "Preço por dia do aluguel: "+ aluguel;
    }

    public void Imprimir(int numDiasAlugados){
        System.out.println("Aluguel de " + getTitulo() + "no valor de R$" + getAluguel() + " por " + numDiasAlugados + " dias");
        System.out.printf("Resultando num valor de %f", ValorAluguelDias(2));
    }
}



