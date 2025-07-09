import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consulta consulta = new Consulta();
        System.out.println("Bievenido/a al conversor de monedas");

        while (true) {
            System.out.println("\n----------MENU-----------");
            System.out.println("1. Realizar conversion");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 0) {
                System.out.println("Gracias por usar el conversor");
                break;
            } else if (opcion == 1) {
                System.out.println("--->Ingrese la divisa que desea convertir (ej: USD, ARS, EUR...): ");
                String origen = scanner.nextLine().toUpperCase();

                //aqui realizamos la consulta a la monedas
                Monedas monedas = consulta.buscarMoneda(origen);
                Map<String, Double> tasas = monedas.conversion_rates();

                if (tasas == null) {
                    System.out.println("❌ No se encontraron tasas para la moneda ingresada.");
                    continue;
                }

                System.out.println("\n✅ Monedas disponibles para convertir desde " + origen + ":");
                for (String moneda : tasas.keySet()) {
                    System.out.println("- " + moneda);
                }

                System.out.print("\n\n👉 Ingrese la moneda destino: ");
                String destino = scanner.nextLine().toUpperCase();
                if (!tasas.containsKey(destino)) {
                    System.out.println("❌ Moneda destino no válida.");
                    return;
                }
                System.out.print("👉 Ingrese el monto a convertir: ");
                double monto = scanner.nextDouble();

                double tasa = tasas.get(destino);
                double resultado = monto * tasa;

                System.out.printf("\n🔁 Tasa de conversión: 1 %s = %.4f %s%n", origen, tasa, destino);
                System.out.printf("💰 Resultado: %.2f %s = %.2f %s%n", monto, origen, resultado, destino);

            } else {
                System.out.println("Opcion invalida");
            }

        }
    }
}
