package com.example.rp_chain.RpChain.Recu.Handler;

import com.example.rp_chain.RpChain.Model.Request;
import com.example.rp_chain.RpChain.Model.Response;

public class ApiKeyHandler extends BaseHandler {
    private final String API_KEY = "carrefour";

    @Override
    public Response handleRequest(Request request) {
        System.out.println(this.getClass().getSimpleName() + " is handling...");
        if (request.getHeaders() != null
                && request.getHeaders().containsKey("api-key")
                && request.getHeaders().get("api-key").equals(API_KEY)) {
            return passToNextHandler(request);
        } else {
            return new Response("403", "Forbidden");
        }
    }
}
