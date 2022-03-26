package com.example.springaccountclient.Model;

public class Account {
    private int sum;
    private int id;
    public Account() {
    }

    public Account(int sum, int id) {
        this.sum = sum;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
