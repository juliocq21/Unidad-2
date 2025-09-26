/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

/**
 *
 * @author user
 */
public class TablaDispersion {

    private String[] tabla;
    private int tamaño;

    // Constructor
    public TablaDispersion(int tamaño) {
        this.tamaño = tamaño;
        this.tabla = new String[tamaño];
    }

    // Función hash (método de división)
    private int funcionHash(int clave) {
        return clave % tamaño;
    }

    // Insertar un valor con clave numérica
    public void insertar(int clave, String valor) {
        int indice = funcionHash(clave);
        tabla[indice] = valor;
        System.out.println("Insertado: " + valor + " en índice " + indice);
    }

    // Buscar un valor dado su clave
    public String buscar(int clave) {
        int indice = funcionHash(clave);
        return tabla[indice];
    }

    // Mostrar tabla
    public void mostrarTabla() {
        System.out.println("\nContenido de la Tabla de Dispersión:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("[" + i + "] => " + tabla[i]);
        }
    }
}
