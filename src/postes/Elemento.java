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
public class Elemento {
    
    protected String nombre;
    protected String uso;
    protected double costo;
    protected String proveedor;
    protected int estado;
    protected String modelo;
    protected String material;
    protected String color;

    public Elemento(String nombre, String uso, double costo, String proveedor, String modelo, String material, String color) {
        this.nombre = nombre;
        this.uso = uso;
        this.costo = costo;
        this.proveedor = proveedor;
        this.estado = 0;
        this.modelo = modelo;
        this.material = material;
        this.color = color;
    }

    public int getEstado() {
        return estado;
    }
    
}