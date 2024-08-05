
package Problema3;


public class CuentaAhorros extends Cuenta {
    private static final double TASA_ANUAL = 0.022;

    public CuentaAhorros(Cliente cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarTasaMensual() {
        saldo += saldo * (TASA_ANUAL / 12);
    }

    @Override
    public void depositar(double monto) {
        double comision = 0;
        if (monto >= 500000 && monto < 2000000) {
            comision = 3000 + (monto * 0.01);
        } else if (monto >= 2000000 && monto <= 10000000) {
            comision = 2000 + (monto * 0.005);
        } else if (monto > 10000000 && monto <= 100000000) {
            comision = monto * 0.018;
        } else if (monto > 100000000) {
            comision = monto * 0.02;
        }
        super.depositar(monto - comision);
    }
}
