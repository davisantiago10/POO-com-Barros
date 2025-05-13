public class Quadrado{
    //atributos
    private int lado;
    //constutor
    public Quadrado(int lado) {
        this.lado = lado;
    }
    //metodos
    public int calcularArea() {
        return lado * lado;
    }
    
    public int calcularPerimetro() {
        return 4 * lado;
    }

    public void imprimir(){
        System.out.printf("Lado: %.2d, Área: %.2d, Perimetro: %.2d \n", lado, calcularArea(), calcularPerimetro());
    }
}
