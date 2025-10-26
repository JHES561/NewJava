//prueba
package practicaPaLuis;

public class Transporte {
    protected int totalCupo;
    protected double precioPorPersona;
    public static final double IVA = 0.19;
    public static final double BONO_ECOLOGICO=20000;

    public Transporte(int totalCupo, double precioPorPersona){
        this.setTotalCupo(totalCupo);
        this.setPrecioPorPersona(precioPorPersona);
    }

    public int getTotalCupo(){
        return totalCupo;
    }
    public void setTotalCupo(int totalCupo){
        this.totalCupo=totalCupo;
    }
    
    public double getPrecioPorPersona(){
        return precioPorPersona;
    }
    public void setPrecioPorPersona(double precioPorPersona){
        this.precioPorPersona=precioPorPersona;
    }
    public double calcularPrecio(){
        return this.precioPorPersona + this.precioPorPersona * Transporte.IVA;
    }
}