package com.modelos.eleccionCaso;

import java.util.Scanner;

public class Eleccion extends Seleccion {
    private double conversion;
    private double valor;
    private String Moneda;

    private  double Estados;

      Scanner scanner = new Scanner(System.in);
    public  Eleccion(int puntero) {
        super();
            Seleccion moneda = new Seleccion();
            switch ( puntero) {
                case 1:
                    valor = moneda.Ficha(scanner);
                    Estados = moneda.monedaConversion("USD", "ARS");
                    Moneda = "Peso Argentino";
                    conversion = Estados * valor;
                    break;

                case 2:
                    valor = moneda.Ficha(scanner);
                    Estados = moneda.monedaConversion("ARS", "USD");
                    Moneda = "Dolares";
                    conversion = Estados * valor;
                    break;
                case 3:
                    valor = moneda.Ficha(scanner);
                    Estados = moneda.monedaConversion("USD", "BRL");
                    Moneda = "Peso Brasileño";
                    conversion = Estados * valor;
                    break;
                case 4:
                    valor = moneda.Ficha(scanner);
                    Estados = moneda.monedaConversion("BRL", "USD");
                    Moneda = "Dolares";
                    conversion = Estados * valor;
                    break;
                case 5:
                    valor = moneda.Ficha(scanner);
                    Estados = moneda.monedaConversion("USD", "COP");
                    Moneda = "Peso Colombiano";
                    conversion = Estados * valor;
                    break;
                case 6:
                    valor = moneda.Ficha(scanner);
                    Estados = moneda.monedaConversion("COP", "USD");
                    Moneda = "Dolares";
                    conversion = Estados * valor;
                    break;
                case 7:

                    break;
            }

        }

    public double Resultado(){
        return  conversion;
    }
    public double valor(){
        return  valor;
    }

    public String getMoneda() {
        return Moneda;
    }
}
