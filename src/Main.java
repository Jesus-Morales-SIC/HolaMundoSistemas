public class Main {
        public static void main(String[] args) {
            System.out.println("=== SISTEMA DE PROCESAMIENTO DE NÓMINA V1.0 ===");

            // 1. Simulación de datos (Arreglos/Arrays idénticos a C++)
            String[] empleados = {"Ana Gómez", "Carlos Ruiz", "Sofía Marín", "Pedro Páez"};
            String[] puestos = {"Desarrolladora Backend", "Líder de Proyecto", "Soporte Técnico", "Auxiliar"};
            double[] salariosBrutos = {35000.00, 52000.00, 18000.00, 12000.00};

            // Constantes del negocio
            double salarioMinimoFiscal = 15000.00;
            double bonoProductividad = 2500.00;
            double acumuladoNominaTotal = 0.0;

            // 2. Estructura de Control Iterativa (Bucle FOR para procesar los datos)
            for (int i = 0; i < empleados.length; i++) {
                double salarioAntesImpuestos = salariosBrutos[i];
                double porcentajeImpuesto = 0.0;

                // 3. Estructura Condicional Compleja (Reglas de negocio/Tabulador fiscal)
                if (salarioAntesImpuestos > 40000.00) {
                    porcentajeImpuesto = 0.25; // 25% de impuesto a salarios altos
                } else if (salarioAntesImpuestos >= salarioMinimoFiscal) {
                    porcentajeImpuesto = 0.16; // 16% de impuesto estándar
                } else {
                    porcentajeImpuesto = 0.08; // 8% de impuesto estímulo a salarios bajos
                    // Estructura anidada: Si gana muy poco y es Auxiliar, se le da un bono corporativo
                    if (puestos[i].equals("Auxiliar")) {
                        salarioAntesImpuestos += bonoProductividad;
                        System.out.printf("[ALERTA] Se aplicó bono de productividad a %s.%n", empleados[i]);
                    }
                }

                // 4. Cálculos Matemáticos Financieros
                double retencion = salarioAntesImpuestos * porcentajeImpuesto;
                double salarioNeto = salarioAntesImpuestos - retencion;
                acumuladoNominaTotal += salarioNeto; // Acumulador para el total de la empresa

                // 5. Salida de datos formateada (Formato de dos decimales para dinero)
                System.out.println("------------------------------------------------");
                System.out.println("Empleado: " + empleados[i] + " | Puesto: " + puestos[i]);
                System.out.printf("  Salario Base: $%.2f%n", salariosBrutos[i]);
                System.out.printf("  Impuesto Retenido (%.0f%%): $%.2f%n", (porcentajeImpuesto * 100), retencion);
                System.out.printf("  👉 SALARIO NETO A PAGAR: $%.2f%n", salarioNeto);
            }

            // 6. Proyección Financiera Final de la Empresa
            System.out.println("================================================");
            System.out.printf("COSTO TOTAL DE LA NÓMINA MENSUAL: $%.2f%n", acumuladoNominaTotal);

            // Proyección a 6 meses con un incremento estimado del 5% en costos operativos
            double proyeccionSemestral = 0.0;
            double gastoMesActual = acumuladoNominaTotal;

            for (int mes = 1; mes <= 6; mes++) {
                gastoMesActual = gastoMesActual * 1.005; // 0.5% de inflación mensual simulada
                proyeccionSemestral += gastoMesActual;
            }
            System.out.printf("PROYECTO DE GASTO EN NÓMINA (PRÓXIMOS 6 MESES): $%.2f%n", proyeccionSemestral);
            System.out.println("================================================");
            //                    [Comodín]             [Salto]    [Variable Real]
            //                    [Comodín]             [Salto]    [Variable Real]


            // Explicacion de los comodines %
            String empleado = "Ana";
            System.out.printf("Hola %s, bienvenido.%n",         empleado);

            // Código escrito:
            //System.out.printf("Impuesto Retenido (%%.0f%%):", (porcentajeImpuesto * 100));

// Paso 1: Java procesa el número (16.0 -> 16)
            //"Impuesto Retenido (16%%):"

// Paso 2: Java procesa el doble porcentaje (%% -> %)
            //"Impuesto Retenido (16%):"




        }

}