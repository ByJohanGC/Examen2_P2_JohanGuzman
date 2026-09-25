/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_p2_johanguzman;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Inventario {
    ArrayList listainventario= new ArrayList();
    public void agregarproducto(Productos t){
        listainventario.add(t);
         
    }
    public String buscarporcodigo(String codigo){
        String producto=" ";
        for(int x=0;x<listainventario.size();x++){
            if(listainventario.get(x)instanceof Productos){
                producto+=(Productos)listainventario.get(x);
                producto+=",";
            }
        }
        return producto;
    }
}
