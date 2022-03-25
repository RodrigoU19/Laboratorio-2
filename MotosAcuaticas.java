package principal;


public class MotosAcuaticas extends Motos {
    
    private int potencia;
    private String llantas;
    
    public MotosAcuaticas (String marcaMoto,String modeloMoto,String colorMoto,int anhoMoto, float precioMoto,int potencia , String llantas)
    {
        super(marcaMoto,modeloMoto,colorMoto,anhoMoto,precioMoto);
        this.potencia = potencia;
        this.llantas = llantas;
      
    }
     public int getPotencia() {
        return potencia;
    }
     
    public String mostrarDatosMotos()
    {
    return "Marca: "+getMarcaMoto()+"\n" +"Modelo: "+getModeloMoto()+"\n"+"Color: "+getColorMoto()+"\n" +"Precio: "+"$"+getPrecioMoto()+
            "\n"+"Año:"+getAnhoMoto()+"\n"+"Potencia maxima : "+potencia+"\n"+"Contiene llantas? "+llantas;
    }

   // Autor: Salvador Arturo Manzur Rodriguez
    
}
