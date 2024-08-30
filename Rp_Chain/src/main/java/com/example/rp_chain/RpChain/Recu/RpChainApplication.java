package com.example.rp_chain.RpChain.Recu;

import com.example.rp_chain.RpChain.Model.Request;
import com.example.rp_chain.RpChain.Model.Response;
import com.google.gson.Gson;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class RpChainApplication {

    public static void main(String[] args) {
        FirstHandler handlerChain = new FirstHandler();


        Request request = new Request();
        request.setPath("/api/test");
        request.setHeaders(Map.of("api-key", "carrefour"));

        Response response = handlerChain.handleRequest(request);
        System.out.println("Response: " + new Gson().toJson(response));
        System.out.println("=========================================\n");

        request.setHeaders(Map.of(
                "api-key", "carrefour",
                "user-token", "123456789"));
        response = handlerChain.handleRequest(request);
        System.out.println("Response: " + new Gson().toJson(response));
        System.out.println("=========================================\n");

    }

}
