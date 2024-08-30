package com.example.rp_chain.RpChain.Recu.Handler;

import com.example.rp_chain.RpChain.Model.Request;
import com.example.rp_chain.RpChain.Model.Response;

public class UserTokenHandler extends BaseHandler {

    @Override
    public Response handleRequest(Request request) {
        System.out.println(this.getClass().getSimpleName() + " is handling...");
        if (request.getHeaders().containsKey("user-token")) {
            return passToNextHandler(request);
        } else {
            return new Response("401", "Unauthorized");
        }
    }
}
