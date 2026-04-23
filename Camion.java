
public class Camion extends Vehiculo {

    private double capacidadCarga;   // en toneladas

    public Camion(String placa, String marca, double velocidadMaxima,
                  double capacidadCarga) {
        super(placa, marca, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    
    @Override
    public void mover() {
        System.out.println("El camión " + marca + " (" + placa + ") "
                + "se desplaza lentamente con una carga de "
                + capacidadCarga + " toneladas.");
    }

    
    @Override
    public double calcularPeaje() {
        return 15000.0;   
    }

    @Override
    public void mostrarInfo() {
        System.out.println("===== CAMIÓN =====");
        super.mostrarInfo();
        System.out.printf ("Capacidad carga : %.1f toneladas%n", capacidadCarga);
        System.out.printf ("Peaje           : $%,.0f%n", calcularPeaje());
        System.out.println();
    }

    public double getCapacidadCarga() { return capacidadCarga; }
}
