public class Televisor{  
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(int canal, int volume){
        this.canal = canal;
        this. volume = volume;
        this.ligado = false;
    }
    //Métodos

    public void Ligar(boolean ligado){
        if(!ligado){
            this.ligado = true;
            System.out.println("O televisor foi ligado com sucesso.");
        }
        else{
            System.out.println("Já estava ligado.");
        }
    }

    public void Desligar(boolean ligado){
        if(ligado){
            this.ligado = false;
            System.out.println("Desligado corretamente.");
        }
        else{
            System.out.println("Já estava desligado.");
        }
    }

    public void AumentarVolume(int aumento){
        if (volume < 100 && aumento <= 100 - volume){ //100 como volume máximo
            volume += aumento;
            System.out.println("Volume aumentado para: "+ volume);
        }

    }




    // gets e setters
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

        public boolean getLigado() {
        return ligado;
    }
        public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
