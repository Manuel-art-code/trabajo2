
public class Moto extends Vehiculo {

    private String tipo;   // "deportiva", "scooter", "todoterreno", etc.

    public Moto(String placa, String marca, double velocidadMaxima, String tipo) {
        super(placa, marca, velocidadMaxima);
        this.tipo = tipo;
    }

    
    @Override
    public void mover() {
        System.out.println("La moto " + marca + " (" + placa + ") tipo " + tipo
                + " se desplaza sobre 2 ruedas con alta maniobrabilidad.");
    }

    
    @Override
    public double calcularPeaje() {
        return 2500.0;   
    }

    @Override
    public void mostrarInfo() {
        System.out.println("===== MOTO =====");
        super.mostrarInfo();
        System.out.println("Tipo            : " + tipo);
        System.out.printf ("Peaje           : $%,.0f%n", calcularPeaje());
        System.out.println();
    }

    public String getTipo() { return tipo; }
}
