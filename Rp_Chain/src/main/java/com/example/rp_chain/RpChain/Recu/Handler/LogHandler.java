package com.example.rp_chain.RpChain.Recu.Handler;


import com.example.rp_chain.RpChain.Model.Request;
import com.example.rp_chain.RpChain.Model.Response;
import com.google.gson.Gson;

public class LogHandler extends BaseHandler{


    @Override
    public Response handleRequest(Request request) {
        System.out.println(this.getClass().getSimpleName() + " is handling...");

        System.out.println("--- Log --- request = " + new Gson().toJson(request));
        return passToNextHandler(request);
    }
}
