package com.example.springaccountclient.Main;

import com.example.springaccountclient.Model.Account;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class Main {

    static final String URL_TRANSFER = "http://localhost:8080/transfer";

    public static void main(String[] args) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Accept", MediaType.APPLICATION_XML_VALUE);
//        headers.setContentType(MediaType.APPLICATION_JSON);
        Account newAccount = new Account(2000, 1);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Account> requestBody = new HttpEntity<>(newAccount);
        ResponseEntity<Account> result
                = restTemplate.postForEntity(URL_TRANSFER, requestBody, Account.class);
//        restTemplate.postForEntity(URL_TRANSFER, 200, Integer.class);
//        System.out.println("Status code:" + result.getStatusCode());
//
//        if (result.getStatusCode() == HttpStatus.OK) {
////            Account e = result.getBody();
//            System.out.println("(Client Side) Account Created: "+ result.getBody());
//        }

    }

}
