package hari3.application;

import hari3.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Dede", "Kotamobagu");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Dede"));
        System.out.println(new LoginRequest("dee", "rahasia"));
    }
}
