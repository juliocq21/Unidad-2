/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
import java.util.LinkedList;

public class HashTableChainingUsuarios {
    private LinkedList<Usuario>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTableChainingUsuarios(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void registrar(Usuario user) {
        int index = HashFunction.simpleHash(user.getUsername(), size);
        table[index].add(user);
    }

    public Usuario iniciarSesion(String username, String password) {
        int index = HashFunction.simpleHash(username, size);
        for (Usuario u : table[index]) {
            if (u.getUsername().equals(username) && u.validarPassword(password)) {
                return u; // inicio correcto
            }
        }
        return null; // usuario no encontrado o contraseña incorrecta
    }

    public void mostrarUsuarios() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + table[i]);
        }
    }
}
