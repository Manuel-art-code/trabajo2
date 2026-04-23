
public class Main {

    public static void main(String[] args) {

        
        Carro  carro  = new Carro ("ABC-123", "Toyota",    180.0, 4);
        Moto   moto   = new Moto  ("MXY-456", "Yamaha",   240.0, "Deportiva");
        Camion camion = new Camion("TRK-789", "Kenworth",  90.0, 30.0);

        
        Vehiculo[] flota = { carro, moto, camion };

        System.out.println("========================================");
        System.out.println("  SISTEMA DE VEHÍCULOS - FLOTA          ");
        System.out.println("========================================\n");

        
        for (Vehiculo v : flota) {
            v.mostrarInfo();    
        }

        
        System.out.println("========================================");
        System.out.println("  DESCRIPCIÓN DE MOVIMIENTO             ");
        System.out.println("========================================");
        for (Vehiculo v : flota) {
            v.mover();          
        }

        
        System.out.println("\n========================================");
        System.out.println("  COBRO DE PEAJES                       ");
        System.out.println("========================================");
        double totalPeajes = 0;
        for (Vehiculo v : flota) {
            double peaje = v.calcularPeaje();
            System.out.printf("%-10s (%s) -> Peaje: $%,.0f%n",
                    v.getMarca(), v.getPlaca(), peaje);
            totalPeajes += peaje;
        }
        System.out.printf("%nTotal recaudado en peajes: $%,.0f%n", totalPeajes);
    }
}
