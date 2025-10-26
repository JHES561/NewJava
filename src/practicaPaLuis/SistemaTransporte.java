package practicaPaLuis;

public class SistemaTransporte {

    public static void main(String[] args) {
        Automovil automovil1 = new Automovil(4, 80000);
        Pasaje pasaje1 = new Pasaje("Oscar", automovil1);
        System.out.println("el pasaje de "+ pasaje1.getNombreCliente()+" vale "+ pasaje1.getTotalPagar());

        AutomovilElectrico automovilElectrico1 = new AutomovilElectrico(6, 100000);
        Pasaje pasaje2 = new Pasaje("Jhoan", automovilElectrico1);
        System.out.println("el pasaje de "+pasaje2.getNombreCliente()+" vale " + pasaje2.getTotalPagar());
    }
}