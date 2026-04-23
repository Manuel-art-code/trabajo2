
public class Carro extends Vehiculo {

    private int numPuertas;

    public Carro(String placa, String marca, double velocidadMaxima, int numPuertas) {
        super(placa, marca, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    
    @Override
    public void mover() {
        System.out.println("El carro " + marca + " (" + placa + ") "
                + "se desplaza sobre 4 ruedas con motor de combustión o eléctrico.");
    }

    // Tarifa de peaje para carros
    @Override
    public double calcularPeaje() {
        return 5000.0;   
    }

    @Override
    public void mostrarInfo() {
        System.out.println("===== CARRO =====");
        super.mostrarInfo();
        System.out.println("Nro. de puertas : " + numPuertas);
        System.out.printf ("Peaje           : $%,.0f%n", calcularPeaje());
        System.out.println();
    }

    public int getNumPuertas() { return numPuertas; }
}
