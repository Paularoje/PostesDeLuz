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
public class Main {
     public static void main(String[] args) {
        Poste p1=new Poste(4.3, 0.4, "concreto",6,"coordenada 1");
        
        p1.impresionElementosPoste();
        Transformador t1=new Transformador(15,0.42,40,1330,715,1345,990,"Transformador 1", "varia la tensión", 2400000, "Schneider Electric","Trihal", "metalico", "plateado");
        p1.instalarElemento(t1, 0);
        p1.impresionElementosPoste();
                
        Poste p2=new Poste(5, 0.5, "concreto",8,"coordenada 2");
        p2.impresionElementosPoste();
        Linea l1=new Linea(230,300, 60, "Línea de alta tensión", "transportar corriente", 128700, "Ancor Marine", "150102", "tinned copper", "blanco");
        p2.instalarElemento(l1, 0);
        p2.impresionElementosPoste();
        
        Conexion c1=new Conexion();
        c1.crearConexion(p1, p2, 0, 0);
        c1.imprimirConexion();
        p1.impresionElementosPoste();
        p2.impresionElementosPoste();
        
        Transformador t2=new Transformador(15,0.42,40,1330,715,1345,990,"Transformador 2", "varia la tensión", 2400000, "Schneider Electric","Trihal", "metalico", "plateado");
        p1.instalarElemento(t2, 1);
        p1.impresionElementosPoste();
        
        Poste p3=new Poste(5, 0.5, "concreto",8,"coordenada 2");
        p3.impresionElementosPoste();
        
        Linea l2=new Linea(230,300, 60, "Línea de media tensión", "transportar corriente", 128700, "Ancor Marine", "150102", "tinned copper", "blanco");
        p3.instalarElemento(l2, 0);
        p3.impresionElementosPoste();
        
        Conexion c2=new Conexion();
        c2.crearConexion(p1, p2, 1, 0);
        c2.imprimirConexion();
        p1.impresionElementosPoste();
        p2.impresionElementosPoste();
        
        Conexion c3=new Conexion();
        c3.crearConexion(p2, p3, 0, 0);
        c3.imprimirConexion();
        p2.impresionElementosPoste();
        p3.impresionElementosPoste();
    }
}
