package clases;

public class Monedas {

    protected String moneda;
    protected static final double VALOR_DOLAR = 3789.38;
    protected double cantidadPesos;
    protected double cantidadDolares;


    public double getCantidadDolares() {
        return cantidadDolares;
    }

    public void setCantidadDolares(double cantidadDolares) {
        this.cantidadDolares = cantidadDolares;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {

        this.moneda = moneda;
    }

    public double getCantidadPesos() {
        return cantidadPesos;
    }

    public void setCantidadPesos(double cantidadPesos) {
        this.cantidadPesos = cantidadPesos;
    }

}
