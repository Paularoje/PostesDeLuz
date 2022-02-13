/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Poste {
    
    private int id;
    private double altura;
    private double diametro;
    private String ubicacion;
    private String material;
    private ArrayList<Elemento> listAnclaje;
    private static int count = 0;

    public Poste(double altura, double diametro, String material, int cantAnclaje, String ubicacion) {
        this.id = count+1;
        count = this.id;
        this.altura=altura;
        this.diametro=diametro;
        this.material=material;
        this.ubicacion = ubicacion;
        listAnclaje = new ArrayList<>(cantAnclaje);
    }
    
    public void instalarElemento(Elemento elemento, int posicion){        
        listAnclaje.add(posicion, elemento);
        System.out.println("El elemento "+elemento.nombre+" se añadio exitosamente en la posicion "+posicion+" del poste "+this.getId()+"\n");
    }
    
    public void impresionElementosPoste(){
        if(listAnclaje.isEmpty()){
            System.out.println("\nEl poste "+this.getId()+" no tiene elementos\n");
        }
        else{
            System.out.println("El poste "+this.getId()+" tiene los siguientes elementos en las posiciones:");
            for(int i=0; i<listAnclaje.size();i++){
                System.out.println("Posición "+i+": "+ listAnclaje.get(i).nombre + " - Conectado: "+listAnclaje.get(i).estado);
            }
        }
    }

    public int getId() {
        return id;
    }

    public double getAltura() {
        return altura;
    }

    public double getDiametro() {
        return diametro;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getMaterial() {
        return material;
    }

    public List<Elemento> getListAnclaje() {
        return listAnclaje;
    }    
       
}
