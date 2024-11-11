package com.angelodev.conversormonedas.peticioneshttp;

import com.angelodev.conversormonedas.dto.ConversionMonedasDTO;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PairConversionRequests {

        String apiKeyRateExchange = "d313ef00c4c3180972c936bf";

        public ConversionMonedasDTO realizaConversion(String monedaBase, String monedaObjetivo, double cantidadAConvertir) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/"+apiKeyRateExchange+"/pair/"
                + monedaBase + "/" + monedaObjetivo + "/" + cantidadAConvertir;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), ConversionMonedasDTO.class);
    }

}
