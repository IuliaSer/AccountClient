package com.example.springaccountclient.Main;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class Main {

    static final String URL_TRANSFER = "http://localhost:8080/transfer";

    public static void main(String[] args) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        Integer sum = 20000;
        HttpEntity<Integer> requestBody = new HttpEntity<>(sum, headers);
        restTemplate.postForEntity(URL_TRANSFER, requestBody, Integer.class);
    }

}
