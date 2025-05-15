public class Retangulo {
    private float comprimento;
    private float largura;
    
    public Retangulo(float comprimento, float largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float calcularArea(){
        return comprimento * largura;
    }
    public float calcularPerimetro(){
        return (2 * comprimento) + (2 * largura);
    }
    public void imprimir(){
        System.out.printf("Comprimento: %.2f, Largura: %.2f, Área: %.2f, Perimetro: %.2f\n", comprimento, largura, calcularArea(), calcularPerimetro());
    }
}