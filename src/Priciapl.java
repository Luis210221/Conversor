import com.modelos.eleccionCaso.Eleccion;
import com.modelos.eleccionCaso.Seleccion;

import java.util.Scanner;

public class Priciapl {
    public static boolean continuar = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (continuar){
            System.out.println("****************\n" +
                    "Bienvenid@ al conversor de monedas\n " +
                    "1) Dolar =>> Peso Argentino\n" +
                    "2) Peso Argentino  =>> Dolar\n" +
                    "3) Dolar =>> Peso Brasileño\n" +
                    "4) Peso Brasileño =>>  Dolar \n" +
                    "5) Dolar =>> Peso Colombiano\n" +
                    "6) Peso Colombiano =>< Dolar\n"+
                    "7) Salir\n" +
                    "Elija la opcio valida\n" +
                    "***************************************");
            int puntero = scanner.nextInt();
            if (puntero == 7) {
                continuar = false;
                break;
            }
                Eleccion eleccionCase = new Eleccion(puntero);
                double res = eleccionCase.Resultado();
                System.out.println("El valor de " + eleccionCase.valor() + " Corresponde a " + res + " " + eleccionCase.getMoneda());

        }
    }
}
