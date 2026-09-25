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
    ArrayList<Productos> listainventario = new ArrayList<Productos>();

    // Revisa si ya existe un producto registrado con ese codigo
    public boolean existecodigo(String codigo) {
        for (int x = 0; x < listainventario.size(); x++) {
            Productos p = listainventario.get(x);
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

    // Intenta agregar un producto validando las reglas del negocio.
    // Devuelve "OK" si se pudo agregar, o el mensaje del error si no.
    public String agregarproducto(Productos t) {
        if (t.getCodigo() == null || t.getCodigo().trim().isEmpty()) {
            return "El codigo no puede estar vacio";
        }
        if (existecodigo(t.getCodigo())) {
            return "Ya existe un producto con el codigo " + t.getCodigo();
        }
        if (t.getPrecio() <= 0) {
            return "El precio debe ser mayor que cero";
        }
        if (t.getCantidad() < 0) {
            return "La cantidad no puede ser negativa";
        }

        listainventario.add(t);
        return "OK";
    }

    // Busca un producto por su codigo. Devuelve null si no lo encuentra.
    public Productos buscarporcodigo(String codigo) {
        for (int x = 0; x < listainventario.size(); x++) {
            Productos p = listainventario.get(x);
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Productos> getListainventario() {
        return listainventario;
    }
}
