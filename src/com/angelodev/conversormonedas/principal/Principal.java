package com.angelodev.conversormonedas.principal;

import com.angelodev.conversormonedas.dto.ConversionMonedasDTO;
import com.angelodev.conversormonedas.peticioneshttp.PairConversionRequests;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        int opcionSeleccionadaPorUsuario = 0;
        double montoAConvertir;
        String menu = """
                1) Dólar ===> Peso Mexicano
                2) Peso Mexicano ===> Dólar
                3) Dólar ===> Peso Argentino
                4) Peso Argentino ===> Dólar
                5) Dólar ===> Real Brazileño
                6) Real Brazileño ===> Dólar
                7) Dólar ===> Peso Colombiano
                8) Peso Colombiano ===> Dólar
                9) Salir
                -----
                """;

        PairConversionRequests conversiona = new PairConversionRequests();
        ConversionMonedasDTO conversion;

        while (opcionSeleccionadaPorUsuario != 9){
            System.out.println("\n**********SISTEMA PARA CONVERSIÓN DE MONEDAS **********");
            System.out.println(menu);
            System.out.println("Seleccione una opción de las anteriores:");
            opcionSeleccionadaPorUsuario = teclado.nextInt();

            if (opcionSeleccionadaPorUsuario == 9){
                System.out.println("Saliendo del sistema ...");
                System.out.println("***** FIN DEL SISTEMA *****");
            } else if (opcionSeleccionadaPorUsuario <=0 || opcionSeleccionadaPorUsuario >9) {
                System.out.println("Valor NO VÁLIDO, ingrese de favor un dígito conforme al menú anterior:");
            } else {
                System.out.println("Ingrese el monto que desea convertir:");
                montoAConvertir = teclado.nextDouble();
                switch (opcionSeleccionadaPorUsuario){
                    case 1:
                        conversion = conversiona.realizaConversion("USD", "MXN", montoAConvertir);
                        System.out.println("El valor " + montoAConvertir + conversion);
                        break;
                    case 2:
                        conversion = conversiona.realizaConversion("MXN", "USD", montoAConvertir);
                        System.out.println("El valor " + montoAConvertir + conversion);
                        break;
                    case 3:
                        conversion = conversiona.realizaConversion("USD", "ARS", montoAConvertir);
                        System.out.println("El valor " + montoAConvertir + conversion);
                        break;
                    case 4:
                        conversion = conversiona.realizaConversion("ARS", "USD", montoAConvertir);
                        System.out.println("El valor " + montoAConvertir + conversion);
                        break;
                    case 5:
                        conversion = conversiona.realizaConversion("USD", "BRL", montoAConvertir);
                        System.out.println("El valor " + montoAConvertir + conversion);
                        break;
                    case 6:
                        conversion = conversiona.realizaConversion("BRL", "USD", montoAConvertir);
                        System.out.println("El valor " + montoAConvertir + conversion);
                        break;
                    case 7:
                        conversion = conversiona.realizaConversion("USD", "COP", montoAConvertir);
                        System.out.println("El valor " + montoAConvertir + conversion);
                        break;
                    case 8:
                        conversion = conversiona.realizaConversion("COP", "USD", montoAConvertir);
                        System.out.println("El valor " + montoAConvertir + conversion);
                        break;
                    default:
                        System.out.println("Ha ocurrido un error, intente de nuevo");
                        break;
                }
            }
        }
    }
}
