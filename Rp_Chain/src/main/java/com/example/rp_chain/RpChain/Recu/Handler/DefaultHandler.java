package com.example.rp_chain.RpChain.Recu.Handler;

import com.example.rp_chain.RpChain.Model.Request;
import com.example.rp_chain.RpChain.Model.Response;

public class DefaultHandler extends BaseHandler {

    @Override
    public Response handleRequest(Request request) {
        System.out.println(this.getClass().getSimpleName() + " is handling...");
        // Handle request
        // ...
        // ...
        // ...
        return new Response("200", "Success");
    }
}
