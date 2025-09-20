/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class Usuario {
    private String username;
    private String password;
    private double saldo;

    public Usuario(String username, String password, double saldo) {
        this.username = username;
        this.password = password;
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public boolean validarPassword(String pass) {
        return this.password.equals(pass);
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return username + " | Saldo: " + saldo;
    }
}
