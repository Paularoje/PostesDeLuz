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
public class Linea extends Elemento{
    private double tensionNominalInf;
    private double tensionNominalSup;
    private double frecuencia;

    public Linea(double tensionNominalInf, double tensionNominalSup, double frecuencia, String nombre, String uso, double costo, String proveedor, String modelo, String material, String color) {
        super(nombre, uso, costo, proveedor, modelo, material, color);
        this.tensionNominalInf = tensionNominalInf;
        this.tensionNominalSup = tensionNominalSup;
        this.frecuencia = frecuencia;
    }

    public double getTensionNominalInf() {
        return tensionNominalInf;
    }

    public double getTensionNominalSup() {
        return tensionNominalSup;
    }

    public double getFrecuencia() {
        return frecuencia;
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
