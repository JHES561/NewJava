//prueba
package practicaPaLuis;

public class AutomovilElectrico extends Transporte{
    public AutomovilElectrico(int totalCupo, double precioPorPersona){
        super(totalCupo,precioPorPersona);
    }
    @Override
    public double calcularPrecio(){
        return super.calcularPrecio()-Transporte.BONO_ECOLOGICO;
    }
}
