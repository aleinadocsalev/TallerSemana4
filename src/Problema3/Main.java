
package Problema3;

import java.util.Scanner;


public class Main {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Aperturas de Cuentas: Ahorro y Corriente.");
            System.out.println("2. Transferencias.");
            System.out.println("3. Cajero Automático.");
            System.out.println("4. Cierre de mes.");
            System.out.println("5. Salir.");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    abrirCuenta(banco, scanner);
                    break;
                case 2:
                    transferir(banco, scanner);
                    break;
                case 3:
                    usarCajero(banco, scanner);
                    break;
                case 4:
                    banco.cierreMes();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void abrirCuenta(Banco banco, Scanner scanner) {
        System.out.print("Ingrese los nombres del cliente: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese los apellidos del cliente: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese la edad del cliente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea
        String representante = null;
        if (edad < 18) {
            System.out.print("Ingrese los nombres del representante: ");
            representante = scanner.nextLine();
        }

        Cliente cliente = new Cliente(nombres, apellidos, edad, representante);

        System.out.print("Tipo de cuenta (1. Ahorros, 2. Corriente): ");
        int tipoCuenta = scanner.nextInt();
        System.out.print("Monto inicial: ");
        double montoInicial = scanner.nextDouble();

        if (tipoCuenta == 1) {
            banco.abrirCuenta(new CuentaAhorros(cliente, montoInicial));
        } else if (tipoCuenta == 2) {
            if (montoInicial >= 200000) {
                banco.abrirCuenta(new CuentaCorriente(cliente, montoInicial));
            } else {
                System.out.println("El monto inicial para cuenta corriente debe ser al menos 200,000.");
            }
        } else {
            System.out.println("Tipo de cuenta no válido.");
        }
    }

    private static void transferir(Banco banco, Scanner scanner) {
        System.out.print("Ingrese los nombres del cliente de origen: ");
        String nombresOrigen = scanner.nextLine();
        System.out.print("Ingrese los apellidos del cliente de origen: ");
        String apellidosOrigen = scanner.nextLine();

        Cuenta cuentaOrigen = banco.buscarCuentaPorNombre(nombresOrigen, apellidosOrigen);
        if (cuentaOrigen == null) {
            System.out.println("Cuenta de origen no encontrada.");
            return;
        }

        System.out.print("Ingrese los nombres del cliente de destino: ");
        String nombresDestino = scanner.nextLine();
        System.out.print("Ingrese los apellidos del cliente de destino: ");
        String apellidosDestino = scanner.nextLine();

        Cuenta cuentaDestino = banco.buscarCuentaPorNombre(nombresDestino, apellidosDestino);
        if (cuentaDestino == null) {
            System.out.println("Cuenta de destino no encontrada.");
            return;
        }

        System.out.print("Ingrese el monto a transferir: ");
        double monto = scanner.nextDouble();

        banco.transferir(cuentaOrigen, cuentaDestino, monto);
    }

    private static void usarCajero(Banco banco, Scanner scanner) {
        System.out.print("Ingrese los nombres del cliente: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese los apellidos del cliente: ");
        String apellidos = scanner.nextLine();

        Cuenta cuenta = banco.buscarCuentaPorNombre(nombres, apellidos);
        if (cuenta == null) {
            System.out.println("Cuenta no encontrada.");
            return;
        }

        System.out.print("Ingrese el monto a retirar: ");
        double monto = scanner.nextDouble();
        System.out.print("¿Es un cajero del mismo banco? (si/no): ");
        String respuesta = scanner.next();
        boolean mismoBanco = respuesta.equalsIgnoreCase("si");

        banco.usarCajero(cuenta, monto, mismoBanco);
    }
}
