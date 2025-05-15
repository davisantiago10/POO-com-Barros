public class Calendario {
    private int dia; 
    private int mes;
    private int ano;

    //método construtor
    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String nomeMes(int m){
        switch (m){
            case 1:
                return "Janeiro";

            case 2:
                return "Fevereiro";

            case 3:
                return "Março";

            case 4:
                return "Abril";

            case 5:
                return "Maio";

            case 6:
                return "Junho";

            case 7:
                return "Julho";

            case 8:
                return "Agosto";

            case 9:
                return "Setembro";

            case 10:
                return "Outubro";

            case 11:
                return "Novembro";

            case 12:
                return "Dezembro";

            default:
                return "Não consegui identificar o mês";
        }

    }

    public String mostrarData(){
        return dia + " de " + nomeMes(mes) + " de " + ano;
    }

    public String anoBi(){
        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            return "O ano "+ ano + " é bissexto";
        }
        else{
            return "O ano " + ano + " não é bissexto";
        }
    }

    public void Imprimir(){
        System.out.println(mostrarData());
        System.out.println(anoBi());
    }
}
