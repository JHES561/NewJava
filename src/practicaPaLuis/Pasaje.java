package practicaPaLuis;

public class Pasaje {
    private String nombreCliente;
    private Transporte transporte;
    private double totalPagar;

    public Pasaje(String nombreCliente, Transporte transporte){
        this.nombreCliente=nombreCliente;
        this.transporte=transporte;
        this.totalPagar=transporte.calcularPrecio();
    }
    public double getTotalPagar(){
        return totalPagar;
    }
    public String getNombreCliente(){
        return nombreCliente;
    }
    public Transporte getTransporte(){
        return transporte;
    }
}