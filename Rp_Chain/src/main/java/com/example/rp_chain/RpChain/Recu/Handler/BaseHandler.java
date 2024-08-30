package com.example.rp_chain.RpChain.Recu.Handler;

import com.example.rp_chain.RpChain.Model.Request;
import com.example.rp_chain.RpChain.Model.Response;

public abstract class BaseHandler {
    private BaseHandler nextHandler;

    public void setNextHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Response handleRequest(Request request) {
        boolean passToNext = false;

        if (passToNext) {
            return this.passToNextHandler(request);
        } else {
            return new Response("200", "OK");
        }
    }

    protected final Response passToNextHandler(Request request) {
        if (nextHandler != null) {
            return nextHandler.handleRequest(request);
        }
        throw new RuntimeException("No handler found for the request");
    }
}
