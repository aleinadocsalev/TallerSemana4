
package Problema3;


public class CuentaCorriente extends Cuenta {
    private static final double TASA_MENSUAL = 0.015;
    private static final double COMISION_CHEQUE = 3000;

    public CuentaCorriente(Cliente cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarTasaMensual() {
        saldo -= saldo * TASA_MENSUAL;
    }

    @Override
    public void depositar(double monto) {
        double comision = 0;
        if (monto < 500000) {
            comision = 7000;
        } else if (monto >= 500000 && monto < 2000000) {
            comision = 5000 + (monto * 0.02);
        } else if (monto >= 2000000 && monto <= 10000000) {
            comision = 4000 + (monto * 0.02);
        } else if (monto > 10000000) {
            comision = monto * 0.033;
        }
        super.depositar(monto - comision);
    }

    public void emitirCheque(double monto) {
        if (monto + COMISION_CHEQUE <= saldo) {
            saldo -= (monto + COMISION_CHEQUE);
        } else {
            System.out.println("Fondos insuficientes para emitir cheque.");
        }
    }
}
