package com.modelos.eleccionCaso;

import com.google.gson.Gson;
import com.modelos.eleccionCaso.Eleccion;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Seleccion  {
    public double monedaConversion(String moneda, String convertidor) {
        // Setting URL
        String url_str = "https://v6.exchangerate-api.com/v6/73b5a2a3128e8f6eaa72e522/latest/" + moneda;

// Making Request

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url_str))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            ConversionDeMonedas conversion = new Gson().fromJson(response.body(), ConversionDeMonedas.class);
            Double usdRate = conversion.convertidor().get(convertidor);
            return usdRate;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public double Ficha(Scanner scanner){
        System.out.println("Ingrese el valor que desea convertir: ");
        return scanner.nextDouble();
    }
}
