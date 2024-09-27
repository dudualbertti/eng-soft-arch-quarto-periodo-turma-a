package com.fag.infra.celcoin.repository;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.net.URLEncoder;

public class CelCoinTokenGenerator {

    public static String CelcoinGenerateToken() {
        try {
            String url = "https://sandbox.openfinance.celcoin.dev/v5/token";
            String clientId = "41b44ab9a56440.teste.celcoinapi.v5";
            String clientSecret = "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3";
            String grantType = "client_credentials";

            String requestBody = "client_id=" + URLEncoder.encode(clientId, StandardCharsets.UTF_8) +
                    "&client_secret=" + URLEncoder.encode(clientSecret, StandardCharsets.UTF_8) +
                    "&grant_type=" + URLEncoder.encode(grantType, StandardCharsets.UTF_8);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                    .build();

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return parseToken(response.body());
            } else {
                System.out.println("Erro na solicitação: " + response.statusCode());
                System.out.println("Resposta: " + response.body());
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String parseToken(String responseBody) {
        String tokenKey = "\"access_token\":\"";
        int startIndex = responseBody.indexOf(tokenKey);
        if (startIndex != -1) {
            int endIndex = responseBody.indexOf("\"", startIndex + tokenKey.length());
            if (endIndex != -1) {
                return responseBody.substring(startIndex + tokenKey.length(), endIndex);
            }
        }
        return null;
    }
}
