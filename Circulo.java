public class Circulo {
    private float raio;
    

    public Circulo(float raio){
        this.raio = raio;
    }
    
    public float calcularArea(){
        return (3.14f * raio * raio);
    }
    public float calcularPerimetro(){
        return (2 * 3.14f * raio);
    }

    public void imprimir(){
        System.out.printf("Raio: %.2f, Área: %.2f, Perimetro: %.2f\n", raio, calcularArea(), calcularPerimetro());
    }
}