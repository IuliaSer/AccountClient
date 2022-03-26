package com.example.springaccountclient.Main;

import com.example.springaccountclient.Model.Account;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Main {

    static final String URL_TRANSFER = "http://localhost:8080/transfer";

    public static void main(String[] args) {
        System.out.println("hi");
        Account newAccount = new Account(2000, 2);
        RestTemplate restTemplate = new RestTemplate();
        // Data attached to the request.
        HttpEntity<Account> requestBody = new HttpEntity<>(newAccount);
        // Send request with POST method.
        ResponseEntity<Account> result
                = restTemplate.postForEntity(URL_TRANSFER, requestBody, Account.class); //!
        System.out.println("Status code:" + result.getStatusCode());
        // Code = 200.
        if (result.getStatusCode() == HttpStatus.OK) {
            Account e = result.getBody();
            System.out.println("(Client Side) Account Created: "+ e.getSum());
        }

    }

}
