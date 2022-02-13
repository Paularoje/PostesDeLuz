/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postes;

/**
 *
 * @author Usuario
 */
public class Transformador extends Elemento{
    private double altaTension;
    private double bajaTension;
    private double temperatura;
    private double longitud;
    private double ancho;
    private double alto;
    private double peso;

    public Transformador(double altaTension, double bajaTension, double temperatura, double longitud, double ancho, double alto, double peso, String nombre, String uso, double costo, String proveedor, String modelo, String material, String color) {
        super(nombre, uso, costo, proveedor, modelo, material, color);
        this.altaTension = altaTension;
        this.bajaTension = bajaTension;
        this.temperatura = temperatura;
        this.longitud = longitud;
        this.ancho = ancho;
        this.alto = alto;
        this.peso = peso;
    }

    public double getAltaTension() {
        return altaTension;
    }

    public double getBajaTension() {
        return bajaTension;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUso() {
        return uso;
    }

    public double getCosto() {
        return costo;
    }

    public String getProveedor() {
        return proveedor;
    }
}
