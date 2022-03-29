package com.example.springaccountclient.Main;

import com.example.springaccountclient.Model.Account;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class Main {

    static final String URL_TRANSFER = "http://localhost:8080/transfer";

    public static void main(String[] args) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
//        Account newAccount = new Account(20, 4000);
        RestTemplate restTemplate = new RestTemplate();
//        HttpEntity<Account> requestBody = new HttpEntity<>(newAccount, headers);
//        ResponseEntity<Account> result
//                = restTemplate.postForEntity(URL_TRANSFER, requestBody, Account.class);
        Integer sum = 20000;
        HttpEntity<Integer> requestBody = new HttpEntity<>(sum, headers);
        restTemplate.postForEntity(URL_TRANSFER, requestBody, Integer.class);
//        System.out.println("Status code:" + result.getStatusCode());
//
//        if (result.getStatusCode() == HttpStatus.OK) {
////            Account e = result.getBody();
//            System.out.println("(Client Side) Account Created: "+ result.getBody());
//        }

    }

}
