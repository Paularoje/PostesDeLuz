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
public class Relay extends Elemento{
    private String contactoTermico;
    private int numPole;
    private double releTermCorrienteNominal;
    private double corrienteOper;
    private double longitud;
    private double ancho;
    private double alto;
    private double peso;

    public Relay(String contactoTermico, int numPole, double releTermCorrienteNominal, double corrienteOper, double longitud, double ancho, double alto, double peso, String nombre, String uso, double costo, String proveedor, String modelo, String material, String color) {
        super(nombre, uso, costo, proveedor, modelo, material, color);
        this.contactoTermico = contactoTermico;
        this.numPole = numPole;
        this.releTermCorrienteNominal = releTermCorrienteNominal;
        this.corrienteOper = corrienteOper;
        this.longitud = longitud;
        this.ancho = ancho;
        this.alto = alto;
        this.peso = peso;
    }

    public String getContactoTermico() {
        return contactoTermico;
    }

    public int getNumPole() {
        return numPole;
    }

    public double getReleTermCorrienteNominal() {
        return releTermCorrienteNominal;
    }

    public double getCorrienteOper() {
        return corrienteOper;
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

    public String getModelo() {
        return modelo;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
    
}
