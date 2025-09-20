/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2;

/**
 *
 * @author LAB-USR-AREQUIPA
 */


import java.util.Scanner;

public class Unidad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashTableChainingUsuarios usuarios = new HashTableChainingUsuarios(10);

        int opcion;
        Usuario usuarioActual = null;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Mostrar todos los usuarios (debug)");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Usuario: ");
                    String user = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String pass = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();

                    usuarios.registrar(new Usuario(user, pass, saldo));
                    System.out.println("? Registro exitoso.");
                    break;

                case 2:
                    System.out.print("Usuario: ");
                    String u = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String p = sc.nextLine();

                    usuarioActual = usuarios.iniciarSesion(u, p);
                    if (usuarioActual != null) {
                        System.out.println("? Bienvenido " + usuarioActual.getUsername());
                        menuUsuario(usuarioActual, sc);
                    } else {
                        System.out.println("? Usuario o contraseña incorrectos.");
                    }
                    break;

                case 3:
                    usuarios.mostrarUsuarios();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    private static void menuUsuario(Usuario usuario, Scanner sc) {
        int opcion;
        do {
            System.out.println("\n=== MENÚ DE USUARIO (" + usuario.getUsername() + ") ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("0. Cerrar sesión");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("? Saldo actual: " + usuario.getSaldo());
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double dep = sc.nextDouble();
                    usuario.depositar(dep);
                    System.out.println("? Depósito exitoso.");
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double ret = sc.nextDouble();
                    if (usuario.retirar(ret)) {
                        System.out.println("? Retiro exitoso.");
                    } else {
                        System.out.println("? Saldo insuficiente.");
                    }
                    break;
                case 0:
                    System.out.println("? Cerrando sesión...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
