
public abstract class Vehiculo {

    
    protected String placa;
    protected String marca;
    protected double velocidadMaxima;   

    // Constructor
    public Vehiculo(String placa, String marca, double velocidadMaxima) {
        this.placa           = placa;
        this.marca           = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    
    public abstract void   mover();
    public abstract double calcularPeaje();

    
    public void mostrarInfo() {
        System.out.println("Placa           : " + placa);
        System.out.println("Marca           : " + marca);
        System.out.println("Vel. máxima     : " + velocidadMaxima + " km/h");
    }

    
    public String getPlaca()            { return placa; }
    public String getMarca()            { return marca; }
    public double getVelocidadMaxima()  { return velocidadMaxima; }
}
