
package Problema3;


public abstract class Cuenta {
    
    protected Cliente cliente;
    protected double saldo;

    public Cuenta(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public Cliente Cliente() {
        return cliente;
    }

    public double Saldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public abstract void aplicarTasaMensual();
}

