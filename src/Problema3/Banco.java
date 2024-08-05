
package Problema3;

import java.util.ArrayList;
import java.util.List;


public class Banco {
     private List<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public void abrirCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public Cuenta buscarCuentaPorNombre(String nombres, String apellidos) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.Cliente().Nombres().equalsIgnoreCase(nombres) || !cuenta.Cliente().Apellidos().equalsIgnoreCase(apellidos)) {
            } else {
                return cuenta;
            }
        }
        return null;
    }

    public void transferir(Cuenta origen, Cuenta destino, double monto) {
        if (origen.Saldo() >= monto) {
            origen.retirar(monto);
            destino.depositar(monto);
        } else {
            System.out.println("Fondos insuficientes para la transferencia.");
        }
    }

    public void usarCajero(Cuenta cuenta, double monto, boolean mismoBanco) {
        if (mismoBanco) {
            cuenta.retirar(monto);
        } else {
            cuenta.retirar(monto + 4500);
        }
    }

    public void cierreMes() {
        for (Cuenta cuenta : cuentas) {
            cuenta.aplicarTasaMensual();
            imprimirEstadoCuenta(cuenta);
        }
    }

    private void imprimirEstadoCuenta(Cuenta cuenta) {
        System.out.println("Estado de Cuenta:");
        System.out.println("Cliente: " + cuenta.Cliente().Nombres() + " " + cuenta.Cliente().Apellidos());
        System.out.println("Saldo: " + cuenta.Saldo());
    }
}
