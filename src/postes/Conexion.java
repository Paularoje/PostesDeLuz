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
public class Conexion {
    private Poste poste1;
    private Poste poste2;
    private int pos1;
    private int pos2;

    public Conexion() {
    }
      
    public void crearConexion(Poste poste1, Poste poste2, int pos1, int pos2){
        Elemento elem1=poste1.getListAnclaje().get(pos1);
        Elemento elem2=poste2.getListAnclaje().get(pos2);
        if(elem1!=null & elem2!=null){
            if(elem1.estado<2 && elem2.estado<2){
                this.poste1=poste1;
                this.poste2=poste2;
                this.pos1=pos1;
                this.pos2=pos2;
                poste1.getListAnclaje().get(pos1).estado=poste1.getListAnclaje().get(pos1).estado+1;
                poste2.getListAnclaje().get(pos2).estado=poste2.getListAnclaje().get(pos2).estado+1;
                System.out.println("\nConexión creada satisfactoriamente");
            }else{
                System.out.println("\nUno de los elementos que intenta conectar ya se encuentra conectado completamente");
            }
        }
    }
    
    public Poste getPoste1() {
        return poste1;
    }

    public Poste getPoste2() {
        return poste2;
    }
    
    public void imprimirConexion(){
        if(poste1!=null & poste2!=null){
            System.out.println("Conexión entre el poste "+poste1.getId()+" (posicion"+pos1+") y el poste "+poste2.getId()+" (posicion"+pos2+")"+"\n");
        }
        else{
            System.out.println("No se pudo hacer la conexión \n");
        }
    }
}
