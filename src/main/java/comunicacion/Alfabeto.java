package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }
    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        String impresion = "";
        for (int i = 0; i < letras.length; i++){
            impresion += letras[i] + ", ";
        }
        return impresion;
    }


}
